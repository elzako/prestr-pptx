package com.aspose.slides.internal.r8;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.j3.z8;
import com.aspose.slides.ms.System.IDisposable;

public class u9 implements com.aspose.slides.internal.d1.u3, IDisposable {
   private z8 n5;
   private int l6;
   private com.aspose.slides.internal.d1.k5 k5;
   private boolean u3;
   private z8 a6;
   private boolean u9;

   public u9(z8 var1, int var2, com.aspose.slides.internal.d1.k5 var3, boolean var4) {
      if (var1 == null) {
         throw new ArgumentNullException("root");
      }

      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public final z8 n5() {
      this.u3();
      z8 var1;
      if (this.a6 == null) {
         var1 = this.n5;
      } else {
         var1 = this.a6.z7();
      }

      for (; var1 != null; var1 = var1.z7()) {
         if (com.aspose.slides.internal.r8.a6.n5(var1, this.l6)) {
            if (this.k5 == null) {
               return this.a6 = var1;
            }

            short var2 = this.k5.n5(var1);
            if (var2 == 1) {
               return this.a6 = var1;
            }
         }
      }

      return var1;
   }

   @Override
   public final z8 l6() {
      this.u3();
      z8 var1;
      if (this.a6 == null) {
         var1 = this.n5;
      } else {
         var1 = this.a6.v4();
      }

      for (; var1 != null; var1 = var1.v4()) {
         if (com.aspose.slides.internal.r8.a6.n5(var1, this.l6)) {
            if (this.k5 == null) {
               return this.a6 = var1;
            }

            short var2 = this.k5.n5(var1);
            if (var2 == 1) {
               return this.a6 = var1;
            }
         }
      }

      return var1;
   }

   public final void k5() {
      this.u9 = true;
      this.a6 = null;
   }

   private void u3() {
      if (this.u9) {
         throw new com.aspose.slides.internal.j3.l6((byte)11);
      }
   }

   @Override
   public final void dispose() {
      this.k5();
   }
}
