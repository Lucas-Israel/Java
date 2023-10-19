package com.podcast.podcast;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/podcasts")
public class PodcastRestController {

  private PodcastService service;

  @Autowired
  public PodcastRestController(PodcastService service) {
    this.service = service;
  }

  /**
   * Rota principal.
   */
  @GetMapping
  public String getRoot() {
    return "Yay Podcasts!";
  }

  /**
   * Método para simular busca por um podcast pelo ID.
   */
  Podcast findPodcastById(Integer id) {
    Podcast podcast = new Podcast();
    podcast.setId(id);
    podcast.setName("Meu podcast");
    podcast.setUrl("http://www.meupodcast.com.br");
    podcast.setSecretToken("super-secret-token-123");

    return podcast;
  }

  /**
   * Rota para pegar informações de um podcast através de variável de caminho.
   */
  @GetMapping("/{id}")
  public ResponseEntity<PodcastDto> getPodcast(@PathVariable Integer id) {
    if (id > 1000)
      return ResponseEntity.notFound().build();

    Podcast podcast = service.findPodcastById(id);

    PodcastDto podcastDto = new PodcastDto(
        podcast.getId(), podcast.getName(), podcast.getUrl()
    );

    return ResponseEntity.ok(podcastDto);
  }


  /**
   * Rota para busca de podcasts pela 'query string'.
   */
  @GetMapping("/search")
  public String searchPodcast(@RequestParam String title) {
    return String.format("Você buscou por Podcasts com o título: %s", title);
  }


  /**
   * Método para simular a criação de um novo podcast.
   */
  Podcast createPodcast(PodcastCreationDto newPodcastDto) {
    Podcast podcast = new Podcast();
    // Vamos fingir que estamos salvando o podcast
    // ao atribuir um ID aleatório a ele
    podcast.setId(new Random().nextInt(0, 1000));

    podcast.setName(newPodcastDto.name());
    podcast.setUrl(newPodcastDto.url());

    podcast.setSecretToken("super-secret-token-123");

    return podcast;
  }

  /**
   * Rota para criação de um novo podcast.
   */
  @PostMapping
  public ResponseEntity<PodcastDto> newPodcast(@RequestBody PodcastCreationDto newPodcast) {
    Podcast podcast = service.createPodcast(newPodcast);

    PodcastDto podcastDto = new PodcastDto(
        podcast.getId(), podcast.getName(), podcast.getUrl()
    );

    return ResponseEntity.status(HttpStatus.CREATED).body(podcastDto);
  }
}