package com.aspose.slides;

public class VideoPlayerHtmlControllerFactory implements IVideoPlayerHtmlControllerFactory {
   @Override
   public final IVideoPlayerHtmlController createVideoPlayerHtmlController(String path, String fileName, String baseUri) {
      return new VideoPlayerHtmlController(path, fileName, baseUri);
   }
}
