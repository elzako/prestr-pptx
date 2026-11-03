package com.aspose.slides.internal.r8;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.j3.z8;
import com.aspose.slides.ms.System.IDisposable;

public class h0 implements com.aspose.slides.internal.d1.a6, IDisposable {
   private z8 n5;
   private int l6;
   private com.aspose.slides.internal.d1.k5 k5;
   private boolean u3;
   private z8 a6;
   private boolean u9;

   public h0(z8 var1, int var2, com.aspose.slides.internal.d1.k5 var3, boolean var4) {
      if (var1 == null) {
         throw new ArgumentNullException("root");
      }

      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var1;
   }

   @Override
   public final z8 n5() {
      return this.n5;
   }

   private boolean l6(z8 var1) {
      if (!com.aspose.slides.internal.r8.a6.n5(var1, this.l6)) {
         return false;
      } else {
         return this.k5 != null ? this.k5.n5(var1) == 1 : true;
      }
   }

   @Override
   public final z8 l6() {
      this.u9();
      return this.a6;
   }

   @Override
   public final void n5(z8 var1) {
      this.u9();
      if (var1 != null && this.l6(var1)) {
         this.a6 = var1;
      } else {
         throw new com.aspose.slides.internal.j3.l6((byte)9);
      }
   }

   @Override
   public final z8 k5() {
      this.u9();
      z8 var1 = this.a6.t1();

      while (var1 != null && !this.l6(var1)) {
         var1 = var1.z7();
      }

      if (var1 != null) {
         this.a6 = var1;
      }

      return var1;
   }

   @Override
   public final z8 u3() {
      this.u9();
      z8 var1 = this.a6.u6();

      while (var1 != null && !this.l6(var1)) {
         var1 = var1.v4();
      }

      if (var1 != null) {
         this.a6 = var1;
      }

      return var1;
   }

   @Override
   public final z8 a6() {
      this.u9();
      z8 var1 = this.a6;

      while (var1 != null) {
         if (var1.t1() != null) {
            var1 = var1.t1();
         } else if (var1.z7() != null) {
            var1 = var1.z7();
         } else {
            while (var1 != null) {
               if (var1.a5() == this.n5 || var1.a5() == null) {
                  return null;
               }

               if (var1.a5().z7() != null) {
                  var1 = var1.a5().z7();
                  break;
               }

               var1 = var1.a5();
            }
         }

         if (var1 != null && this.l6(var1)) {
            break;
         }
      }

      if (var1 != null) {
         this.a6 = var1;
      }

      return var1;
   }

   private void u9() {
      if (this.u9) {
         throw new com.aspose.slides.internal.j3.l6((byte)11);
      }
   }

   @Override
   public final void dispose() {
      this.u9 = true;
      this.a6 = null;
   }
}
