package functionalProgramming.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        Video video = new Video("video", "netflix.com", VideoType.CLIP);
        Video video1 = new Video("video1", "netflix/1.com", VideoType.EPISODE);
        Video video2 = new Video("video2", "netflix/2.com", VideoType.PREVIEW);
        Video video3 = new Video("video3", "netflix/3.com", VideoType.CLIP);
        Video video4 = new Video("video4", "netflix/4.com", VideoType.EPISODE);
        Video video5 = new Video("video5", "netflix/5.com", VideoType.CLIP);
        Video video6 = new Video("video6", "netflix/6.com", VideoType.PREVIEW);
        Video video7 = new Video("video7", "netflix/7.com", VideoType.EPISODE);

        Episode episode = new Episode("episode1", 1, Arrays.asList(video, video1));
        Episode episode23 = new Episode("episode23", 2, Arrays.asList(video2, video3));
        Episode episode45 = new Episode("episode45", 3, Arrays.asList(video4, video5));
        Episode episode67 = new Episode("episode67", 4, Arrays.asList(video6, video7));

        Season season1 = new Season("season1", 1, Arrays.asList(episode, episode23));
        Season season2 = new Season("season2", 2, Arrays.asList(episode45, episode67));

        List<Season> seasons = new ArrayList<>();
        seasons.add(season1);
        seasons.add(season2);

        List<Episode> episodes = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .collect(Collectors.toList());

        for (Episode e : episodes) {
            System.out.println(e);
        }
        System.out.println();

        List<Video> videos = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());

        for (Video v : videos) {
            System.out.println(v);
        }
        System.out.println();

        List<String> namesOfSeasons = seasons.stream()
                .map(s -> s.seasonName)
                .collect(Collectors.toList());

        for (String namesOfSeason : namesOfSeasons) {
            System.out.println(namesOfSeason);
        }
        System.out.println();

        List<Integer> numbersOfSeasons = seasons.stream()
                .map(s -> s.seasonNumber)
                .collect(Collectors.toList());

        for (Integer numbersOfSeason : numbersOfSeasons) {
            System.out.println(numbersOfSeason);
        }
        System.out.println();

        List<String> namesOfEpisodes = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeName)
                .collect(Collectors.toList());

        for (String nameOfEpisode : namesOfEpisodes) {
            System.out.println(nameOfEpisode);
        }
        System.out.println();

        List<Integer> numbersOfEpisodes = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeNumber)
                .collect(Collectors.toList());

        for (Integer numberOfEpisode : numbersOfEpisodes) {
            System.out.println(numberOfEpisode);
        }
        System.out.println();

        List<String> namesOfVideos = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.title)
                .collect(Collectors.toList());

        for (String nameOfVideo : namesOfVideos) {
            System.out.println(nameOfVideo);
        }
        System.out.println();

        List<String> urls = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.url)
                .collect(Collectors.toList());

        for (String url : urls) {
            System.out.println(url);
        }
        System.out.println();

        List<Episode> evenSeasonsEpisodes = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .collect(Collectors.toList());

        for (Episode evenSeasonsEpisode : evenSeasonsEpisodes) {
            System.out.println(evenSeasonsEpisode);
        }
        System.out.println();

        List<Video> evenSeasonsVideos = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());

        for (Video evenSeasonsVideo : evenSeasonsVideos) {
            System.out.println(evenSeasonsVideo);
        }
        System.out.println();

        List<Video> evenSeasonsEpisodesVideos = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());

        for (Video evenSeasonsEpisodesVideo : evenSeasonsEpisodesVideos) {
            System.out.println(evenSeasonsEpisodesVideo);
        }
        System.out.println();


        List<Video> oddSeasonsEvenEpisodesClipVideos = seasons.stream()
                .filter(s -> s.seasonNumber % 2 != 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .flatMap(e -> e.videos.stream())
                .filter(v -> v.videoType == VideoType.CLIP)
                .collect(Collectors.toList());

        for (Video oddSeasonsEvenEpisodesClipVideo : oddSeasonsEvenEpisodesClipVideos) {
            System.out.println(oddSeasonsEvenEpisodesClipVideo);
        }
        System.out.println();

        List<Video> evenSeasonsOddEpisodesPreviewVideos = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 != 0)
                .flatMap(e -> e.videos.stream())
                .filter(v -> v.videoType == VideoType.PREVIEW)
                .collect(Collectors.toList());

        for (Video evenSeasonsOddEpisodesPreviewVideo : evenSeasonsOddEpisodesPreviewVideos) {
            System.out.println(evenSeasonsOddEpisodesPreviewVideo);
        }
        System.out.println();
    }
}
