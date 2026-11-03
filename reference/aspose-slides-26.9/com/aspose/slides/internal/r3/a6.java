package com.aspose.slides.internal.r3;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.q7.c8;
import com.aspose.slides.internal.q7.y4;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.n3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;

public class a6 implements c8 {
   private final com.aspose.slides.internal.q7.u3 n5;
   private final t4 l6;
   private byte[] k5;
   private byte[] u3;
   private l6 a6;

   public a6(com.aspose.slides.internal.q7.u3 var1, t4 var2, byte[] var3) {
      if (var2 == null) {
         throw new ArgumentNullException("sourceStream");
      }

      this.n5 = var1;
      this.k5 = var3;
      this.l6 = var2;
   }

   @Override
   public final void dispose() {
      if (this.u9()) {
         this.a6();
      }
   }

   @Override
   public final byte[] n5() {
      if (this.u3 == null) {
         if (!this.u9()) {
            this.u3();
         }

         this.u3 = this.a6.n5();
         this.a6();
      }

      return this.u3;
   }

   @Override
   public final t4 l6() {
      if (this.u3 == null) {
         if (!this.u9()) {
            this.u3();
         }

         return this.a6.l6();
      } else {
         return new e2(this.u3);
      }
   }

   @Override
   public final long k5() {
      return com.aspose.slides.internal.v6g.k5.h0(this.u3 == null ? 0 : this.u3.length, 9);
   }

   public final void u3() {
      if (this.n5.u9()) {
         this.c8();
      } else {
         this.h0();
         n3[] var1 = new n3[]{null};

         try {
            var1[0] = new n3(this.a6.u3(), 1, 2);
         } catch (RuntimeException var6) {
            if (var1[0] != null) {
               var1[0].dispose();
            }

            throw new y4(d1.n5("Temp file '{0}' could not be created", new Object[]{this.a6.u3()}), var6);
         }

         try {
            if (this.k5 != null) {
               var1[0].write(this.k5, 0, this.k5.length);
            }

            com.aspose.slides.internal.q7.n5.n5(this.l6, new a6$1(this, var1), this.n5.u3());
         } finally {
            var1[0].dispose();
         }
      }
   }

   private void a6() {
      try {
         com.aspose.slides.internal.z0k.u9.l6(this.a6.u3());
         this.a6.dispose();
         this.a6 = null;
      } catch (RuntimeException var2) {
         this.n5.k5().n5(var2.getMessage());
      }
   }

   private boolean u9() {
      return this.a6 != null && this.a6.a6();
   }

   private void h0() {
      if (this.a6 == null) {
         if (!this.n5.n5().getInitialized()) {
            this.n5.n5().init();
         }

         String var1 = this.n5.n5().getNextTempFilePath();
         this.a6 = new l6(var1);
      }
   }

   private void c8() {
      e2 var1 = new e2();

      try {
         if (this.k5 != null) {
            var1.write(this.k5, 0, this.k5.length);
         }

         byte[] var2 = com.aspose.slides.internal.q7.n5.n5(this.l6);
         var1.write(var2, 0, var2.length);
         this.u3 = var1.toArray();
         this.k5 = null;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
