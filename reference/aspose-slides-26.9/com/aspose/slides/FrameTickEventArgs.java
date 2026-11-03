package com.aspose.slides;

public class FrameTickEventArgs {
   private final PresentationPlayer n5;
   private final IPresentationAnimationPlayer l6;

   FrameTickEventArgs(PresentationPlayer player, IPresentationAnimationPlayer animationPlayer) {
      this.n5 = player;
      this.l6 = animationPlayer;
   }

   public final PresentationPlayer getPlayer() {
      return this.n5;
   }

   public final IImage getFrame() {
      return this.l6.getFrame();
   }
}
