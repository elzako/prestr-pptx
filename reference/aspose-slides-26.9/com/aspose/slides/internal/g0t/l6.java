package com.aspose.slides.internal.g0t;

import com.aspose.slides.internal.o9b.z1;
import java.awt.AlphaComposite;
import java.awt.Composite;

public class l6 {
   private final z1 n5;
   private int l6;
   private int k5;

   public l6(z1 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.n5(var2, var3);
   }

   public int n5() {
      return this.l6;
   }

   public void n5(int var1) {
      this.l6 = var1;
      this.n5(this.l6, this.k5);
   }

   public int l6() {
      return this.k5;
   }

   public void l6(int var1) {
      this.k5 = var1;
      this.n5(this.l6, this.k5);
   }

   private void n5(int var1, int var2) {
      Composite var3;
      if (this.u3(var2)) {
         var3 = new n5(this.k5(var1));
      } else {
         var3 = this.k5(var1);
      }

      this.n5.z8().setComposite(var3);
   }

   private Composite k5(int var1) {
      return var1 == 1 ? AlphaComposite.Src : AlphaComposite.SrcOver;
   }

   private boolean u3(int var1) {
      return var1 == 3 || var1 == 2;
   }
}
