package com.aspose.slides.internal.j9e;

import com.aspose.slides.ms.System.v4;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import javax.imageio.metadata.IIOMetadata;

public class z3 implements v4 {
   private Image l6;
   private Image[] k5;
   private c8 u3;
   private IIOMetadata a6;
   private x8 u9;
   private float h0;
   private float c8;
   Hashtable n5 = new Hashtable();

   public z3() {
   }

   public z3(Image var1, Image[] var2, x8 var3, float var4, float var5, c8 var6) {
      this.l6 = var1;
      this.k5 = var2;
      this.u9 = var3;
      this.h0 = var4;
      this.c8 = var5;
      this.u3 = var6;
   }

   private Image t2() {
      return this.l6;
   }

   private void l6(Image var1) {
      this.l6 = var1;
   }

   public Image n5() {
      return this.t2();
   }

   public void n5(Image var1) {
      this.l6(var1);
   }

   public IIOMetadata l6() {
      return this.a6;
   }

   public void n5(IIOMetadata var1) {
      this.a6 = var1;
   }

   public x8 k5() {
      return this.u9;
   }

   public c8 u3() {
      return this.u3;
   }

   public Image[] a6() {
      return this.k5;
   }

   public float u9() {
      return this.h0;
   }

   public void n5(float var1) {
      this.h0 = var1;
   }

   public float h0() {
      return this.c8;
   }

   public void l6(float var1) {
      this.c8 = var1;
   }

   public Object n5(String var1) {
      return this.n5.get(var1);
   }

   public Object n5(String var1, Object var2) {
      return this.n5.put(var1, var2);
   }

   public Hashtable c8() {
      return this.n5;
   }

   @Override
   public Object deepClone() {
      return this.n5(true);
   }

   public z3 n5(boolean var1) {
      Image var2 = this.n5();
      Image[] var3 = this.k5;
      if (var1) {
         var2 = new BufferedImage(
            ((BufferedImage)this.t2()).getColorModel(),
            ((BufferedImage)this.t2()).copyData(null),
            ((BufferedImage)this.t2()).isAlphaPremultiplied(),
            (Hashtable<?, ?>)this.n5.clone()
         );
         if (this.a6() != null) {
            var3 = new Image[this.a6().length];

            for (int var4 = 0; var4 < this.a6().length; var4++) {
               var3[var4] = new BufferedImage(
                  ((BufferedImage)this.a6()[var4]).getColorModel(),
                  ((BufferedImage)this.a6()[var4]).copyData(null),
                  ((BufferedImage)this.a6()[var4]).isAlphaPremultiplied(),
                  (Hashtable<?, ?>)this.n5.clone()
               );
            }
         }
      }

      return new z3(var2, var3, this.k5(), this.u9(), this.h0(), this.u3());
   }
}
