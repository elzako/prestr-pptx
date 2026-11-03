package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class VideoFrame extends PictureFrame implements IVideoFrame {
   String n5 = "";
   String l6 = "";
   Video k5 = null;
   boolean u3;
   int e2;
   boolean t9;
   boolean z1;
   boolean t4;
   private ICaptionsCollection q0;
   private float z3;
   private float m1;

   VideoFrame(r0g parentImmediate) {
      super(parentImmediate, new o5o());
      this.n5(new r8r(this));
   }

   final o5o n5() {
      return (o5o)super.a6();
   }

   @Override
   public final boolean getRewindVideo() {
      return this.t4;
   }

   @Override
   public final void setRewindVideo(boolean value) {
      this.t4 = value;
   }

   @Override
   public final boolean getPlayLoopMode() {
      return this.z1;
   }

   @Override
   public final void setPlayLoopMode(boolean value) {
      this.z1 = value;
   }

   @Override
   public final boolean getHideAtShowing() {
      return this.t9;
   }

   @Override
   public final void setHideAtShowing(boolean value) {
      this.t9 = value;
   }

   @Override
   public final int getVolume() {
      return this.e2;
   }

   @Override
   public final void setVolume(int value) {
      this.e2 = value;
   }

   @Override
   public final int getPlayMode() {
      return this.n5().n5();
   }

   @Override
   public final void setPlayMode(int value) {
      this.n5().n5(value);
      switch (this.n5().n5()) {
         case -1:
         default:
            break;
         case 0:
         case 2:
            this.getSlide().getTimeline().getMainSequence().removeByShape(this);
            IGenericEnumerator var21 = this.getSlide().getTimeline().getInteractiveSequences().iterator();

            try {
               while (var21.hasNext()) {
                  Sequence var23 = (Sequence)var21.next();
                  var23.removeByShape(this);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
                  var21.dispose();
               }
            }

            this.getSlide().getTimeline().getMainSequence().addEffect(this, 56, 0, 0);
            ISequence var25 = this.getSlide().getTimeline().getInteractiveSequences().add(this);
            var25.addEffect(this, 55, 0, 1);
            break;
         case 1:
            this.getSlide().getTimeline().getMainSequence().removeByShape(this);
            IGenericEnumerator var20 = this.getSlide().getTimeline().getInteractiveSequences().iterator();

            try {
               while (var20.hasNext()) {
                  Sequence var22 = (Sequence)var20.next();
                  var22.removeByShape(this);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
                  var20.dispose();
               }
            }

            ISequence var24 = this.getSlide().getTimeline().getInteractiveSequences().add(this);
            var24.addEffect(this, 55, 0, 1);
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
            ISequence var5 = this.getSlide().getTimeline().getInteractiveSequences().add(this);
            var5.addEffect(this, 55, 0, 1);
      }
   }

   @Override
   public final boolean getFullScreenMode() {
      return this.u3;
   }

   @Override
   public final void setFullScreenMode(boolean value) {
      this.u3 = value;
   }

   @Override
   public final String getLinkPathLong() {
      return this.n5;
   }

   @Override
   public final void setLinkPathLong(String value) {
      if (value != null) {
         this.n5 = value;
         this.l6 = com.aspose.slides.internal.z0k.z1.n5(this.n5);
      } else {
         this.n5 = this.l6 = null;
      }
   }

   @Override
   public final IVideo getEmbeddedVideo() {
      return this.k5;
   }

   @Override
   public final void setEmbeddedVideo(IVideo value) {
      if (value != null && this.getPresentation() != ((Video)value).k5()) {
         throw new PptxEditException("Can't assign Video object from the another presentation.");
      }

      this.k5 = (Video)value;
   }

   @Override
   public final float getTrimFromStart() {
      return this.z3;
   }

   @Override
   public final void setTrimFromStart(float value) {
      this.z3 = value;
   }

   @Override
   public final float getTrimFromEnd() {
      return this.m1;
   }

   @Override
   public final void setTrimFromEnd(float value) {
      this.m1 = value;
   }

   @Override
   public final ICaptionsCollection getCaptionTracks() {
      if (this.q0 == null) {
         this.q0 = new CaptionsCollection(this);
      }

      return this.q0;
   }

   final boolean k5() {
      return this.getTrimFromStart() != 0.0F || this.getTrimFromEnd() != 0.0F || this.getCaptionTracks().getCount() > 0;
   }

   @Override
   void s7() {
      float var1 = this.getWidth() / this.getHeight();
      super.s7();
      ShapeFrame var2 = ((Slide)this.j9()).w1().l6(this.getPlaceholder().getIndex()).p8();
      if (var2.getWidth() > var2.getHeight()) {
         this.setHeight(var2.getHeight());
         this.setWidth(this.getHeight() * var1);
      } else {
         this.setWidth(var2.getWidth());
         this.setHeight(this.getWidth() / var1);
      }

      this.setX(var2.getCenterX() - this.getWidth() / 2.0F);
      this.setY(var2.getCenterY() - this.getHeight() / 2.0F);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   o5o a6() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   o5o u9() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   o5o h0() {
      return this.n5();
   }

}
