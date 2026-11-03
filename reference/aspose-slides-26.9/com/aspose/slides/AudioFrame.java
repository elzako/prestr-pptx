package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class AudioFrame extends PictureFrame implements IAudioFrame {
   String n5 = "";
   String l6 = "";
   private Audio e2;
   int k5;
   boolean u3;
   private boolean t9;
   private int z1;
   private ICaptionsCollection t4;
   private int q0;
   private int z3;
   private int m1;
   private int k7;
   private boolean m3;
   private boolean z8;
   private float j5;
   private float w1;
   private float r4;
   private float c4;
   private float y2;

   AudioFrame(r0g parentImmediate) {
      super(parentImmediate, new r1());
      this.n5(new r8r(this));
   }

   final r1 n5() {
      return (r1)super.a6();
   }

   @Override
   public final int getAudioCdStartTrack() {
      return this.q0;
   }

   @Override
   public final void setAudioCdStartTrack(int value) {
      this.q0 = value;
   }

   @Override
   public final int getAudioCdStartTrackTime() {
      return this.z3;
   }

   @Override
   public final void setAudioCdStartTrackTime(int value) {
      this.z3 = value;
   }

   @Override
   public final int getAudioCdEndTrack() {
      return this.m1;
   }

   @Override
   public final void setAudioCdEndTrack(int value) {
      this.m1 = value;
   }

   @Override
   public final int getAudioCdEndTrackTime() {
      return this.k7;
   }

   @Override
   public final void setAudioCdEndTrackTime(int value) {
      this.k7 = value;
   }

   @Override
   public final int getVolume() {
      return this.z1;
   }

   @Override
   public final void setVolume(int value) {
      this.z1 = value;
      if (value > 0) {
         this.n5(r8.n5[value]);
      }
   }

   @Override
   public final int getPlayMode() {
      return this.k5;
   }

   @Override
   public final void setPlayMode(int value) {
      this.k5 = value;
      switch (this.k5) {
         case -1:
         default:
            break;
         case 0:
            this.getSlide().getTimeline().getMainSequence().removeByShape(this);
            IGenericEnumerator var30 = this.getSlide().getTimeline().getInteractiveSequences().iterator();

            try {
               while (var30.hasNext()) {
                  Sequence var34 = (Sequence)var30.next();
                  var34.removeByShape(this);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                  var30.dispose();
               }
            }

            this.getSlide().getTimeline().getMainSequence().addEffect(this, 56, 0, 0);
            break;
         case 1:
            this.getSlide().getTimeline().getMainSequence().removeByShape(this);
            IGenericEnumerator var29 = this.getSlide().getTimeline().getInteractiveSequences().iterator();

            try {
               while (var29.hasNext()) {
                  Sequence var32 = (Sequence)var29.next();
                  var32.removeByShape(this);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
                  var29.dispose();
               }
            }

            ISequence var33 = this.getSlide().getTimeline().getInteractiveSequences().add(this);
            var33.addEffect(this, 56, 0, 1);
            break;
         case 2:
            this.getSlide().getTimeline().getMainSequence().removeByShape(this);
            IGenericEnumerator var28 = this.getSlide().getTimeline().getInteractiveSequences().iterator();

            try {
               while (var28.hasNext()) {
                  Sequence var31 = (Sequence)var28.next();
                  var31.removeByShape(this);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
                  var28.dispose();
               }
            }

            this.getSlide().getTimeline().getMainSequence().addEffect(this, 56, 0, 0);
            this.k5 = 0;
            this.setPlayAcrossSlides(true);
            break;
         case 3:
            this.getSlide().getTimeline().getMainSequence().removeByShape(this);
            IGenericEnumerator var2 = this.getSlide().getTimeline().getInteractiveSequences().iterator();

            try {
               while (var2.hasNext()) {
                  Sequence var3 = (Sequence)var2.next();
                  var3.removeByShape(this);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }

            this.getSlide().getTimeline().getMainSequence().addEffect(this, 56, 0, 1);
      }
   }

   @Override
   public final boolean getHideAtShowing() {
      return this.u3;
   }

   @Override
   public final void setHideAtShowing(boolean value) {
      this.u3 = value;
   }

   @Override
   public final boolean getPlayLoopMode() {
      return this.t9;
   }

   @Override
   public final void setPlayLoopMode(boolean value) {
      this.t9 = value;
   }

   @Override
   public final boolean getPlayAcrossSlides() {
      return this.m3;
   }

   @Override
   public final void setPlayAcrossSlides(boolean value) {
      this.m3 = value;
   }

   @Override
   public final boolean getRewindAudio() {
      return this.z8;
   }

   @Override
   public final void setRewindAudio(boolean value) {
      this.z8 = value;
   }

   @Override
   public final boolean getEmbedded() {
      return this.e2 != null;
   }

   @Override
   public final String getLinkPathLong() {
      return !this.getEmbedded() && this.n5().n5() != 2 ? this.n5 : "";
   }

   @Override
   public final void setLinkPathLong(String value) {
      if (!this.getEmbedded() && this.n5().n5() != 2) {
         if (value == null || !com.aspose.slides.internal.n2d.m1.l6 && !com.aspose.slides.internal.n2d.m1.k5) {
            this.n5 = value;
         } else {
            this.n5 = com.aspose.slides.ms.System.d1.n5(value, "\\", "/");
         }

         this.l6 = com.aspose.slides.internal.z0k.z1.n5(this.n5);
      }
   }

   @Override
   public final IAudio getEmbeddedAudio() {
      return this.e2;
   }

   @Override
   public final void setEmbeddedAudio(IAudio value) {
      if (value != null && this.getPresentation() != ((Audio)value).a6()) {
         throw new PptxEditException("Can't assign Audio object from the another presentation.");
      }

      this.e2 = (Audio)value;
   }

   @Override
   public final float getFadeInDuration() {
      return this.j5;
   }

   @Override
   public final void setFadeInDuration(float value) {
      this.j5 = value;
   }

   @Override
   public final float getFadeOutDuration() {
      return this.w1;
   }

   @Override
   public final void setFadeOutDuration(float value) {
      this.w1 = value;
   }

   @Override
   public final float getVolumeValue() {
      return this.l6();
   }

   @Override
   public final void setVolumeValue(float value) {
      this.n5(value);
      this.z1 = q3f.n5(this.l6());
   }

   @Override
   public final float getTrimFromStart() {
      return this.r4;
   }

   @Override
   public final void setTrimFromStart(float value) {
      this.r4 = value;
   }

   @Override
   public final float getTrimFromEnd() {
      return this.c4;
   }

   @Override
   public final void setTrimFromEnd(float value) {
      this.c4 = value;
   }

   @Override
   public final ICaptionsCollection getCaptionTracks() {
      if (this.t4 == null) {
         this.t4 = new CaptionsCollection(this);
      }

      return this.t4;
   }

   final float l6() {
      return this.y2;
   }

   final void n5(float var1) {
      this.y2 = var1;
   }

   final boolean k5() {
      return this.getFadeInDuration() != 0.0F
         || this.getFadeOutDuration() != 0.0F
         || this.getTrimFromStart() != 0.0F
         || this.getTrimFromEnd() != 0.0F
         || this.getCaptionTracks().getCount() > 0;
   }

   final void u3() {
      this.getPictureFormat().getPicture().setImage(((ImageCollection)this.getPresentation().getImages()).l6());
   }

   final boolean n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.e2 = (Audio)((AudioCollection)this.getPresentation().getAudios()).n5(var1);
      return true;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   r1 a6() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   r1 u9() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   r1 h0() {
      return this.n5();
   }

}
