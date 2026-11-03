package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public class PresentationPlayer implements IDisposable {
   private final PresentationAnimationsGenerator n5;
   private final k3s l6;
   private int k5 = 0;
   private double u3 = 0.0;
   private PresentationPlayer$FrameTick a6;

   public PresentationPlayer(PresentationAnimationsGenerator generator, double fps) {
      if (generator == null) {
         throw new ArgumentNullException("generator");
      }

      double var4 = 1000.0 / fps;
      this.n5 = generator;
      this.n5.n5((float)var4);
      this.l6 = new k3s(var4);
      this.n5.setNewAnimation(new PresentationPlayer$1(this));
   }

   @Override
   public final void dispose() {
      this.n5.setNewAnimation(null);
   }

   public final int getFrameIndex() {
      return this.k5;
   }

   public void setFrameTick(PresentationPlayer$FrameTick event) {
      this.a6 = event;
   }

   private void n5(IPresentationAnimationPlayer var1) {
      int var2 = this.l6.n5(var1.getDuration());
      double var3 = this.l6.n5();
      FrameTickEventArgs var5 = new FrameTickEventArgs(this, var1);

      for (int var6 = 0; var6 < var2; var6++) {
         double var7 = var3 * var6;
         this.u3 = var3 * this.k5;
         var1.setTimePosition(var7);
         if (this.a6 != null) {
            this.a6.invoke(this, var5);
         }

         this.k5++;
      }
   }

   // $VF: synthetic method
   static void n5(PresentationPlayer var0, IPresentationAnimationPlayer var1) {
      var0.n5(var1);
   }
}
