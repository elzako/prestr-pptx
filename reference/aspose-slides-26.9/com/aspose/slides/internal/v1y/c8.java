package com.aspose.slides.internal.v1y;

import com.aspose.slides.exceptions.ArgumentException;

public class c8 {
   public com.aspose.slides.internal.v9l.a6 n5(com.aspose.slides.internal.t9z.h0 var1, com.aspose.slides.internal.v9l.k5 var2) {
      com.aspose.slides.internal.v9l.a6 var3 = new com.aspose.slides.internal.v9l.a6();
      u3$n5 var4 = this.l6(var1, var2);
      var3.n5(var4.l6);
      u3$n5 var5 = this.k5(var1, var4.n5);
      var3.l6(var5.l6);
      var3.n5(var5.n5);
      var3.n5(var4.k5);
      var3.l6(var4.u3);
      var3.k5(var5.k5);
      var3.u3(var5.u3);
      return var3;
   }

   private u3$n5 l6(com.aspose.slides.internal.t9z.h0 var1, com.aspose.slides.internal.v9l.k5 var2) {
      com.aspose.slides.internal.x4g.u9 var3 = null;
      if (var1.n5().n3() == 255) {
         try {
            var3 = var1.n5().h0();
         } catch (ArgumentException var5) {
         }
      }

      return this.n5(var1, var1.n5().n3(), var3, var2);
   }

   private u3$n5 k5(com.aspose.slides.internal.t9z.h0 var1, com.aspose.slides.internal.v9l.k5 var2) {
      com.aspose.slides.internal.v9l.k5 var3 = var2.c8();
      com.aspose.slides.internal.x4g.u9 var4 = null;
      if (var1.n5().y4() == 255) {
         try {
            var4 = var1.n5().u9();
         } catch (ArgumentException var6) {
         }
      }

      u3$n5 var5 = this.n5(var1, var1.n5().y4(), var4, var3);
      var5.n5 = var5.n5.c8();
      if (var5.u3 != null) {
         var5.u3.n5(-var5.u3.l6());
         var5.u3.l6(-var5.u3.k5());
      }

      return var5;
   }

   private u3$n5 n5(com.aspose.slides.internal.t9z.h0 var1, int var2, com.aspose.slides.internal.x4g.u9 var3, com.aspose.slides.internal.v9l.k5 var4) {
      u3 var5 = this.n5(var1, var2, var3);
      if (var5 == null) {
         u3$n5 var6 = new u3$n5();
         var6.n5 = var4;
         return var6;
      } else {
         return var5.n5(var4);
      }
   }

   private u3 n5(com.aspose.slides.internal.t9z.h0 var1, int var2, com.aspose.slides.internal.x4g.u9 var3) {
      if (var2 == 20 || var2 == 19 || var2 == 18 || var2 == 17) {
         return new t2(var1, var2);
      } else if (var2 != 255 || var3 == null) {
         return null;
      } else {
         return var3.x8() ? new x8(var1, var3) : new h0(var1, var3);
      }
   }
}
