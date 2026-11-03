package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class y6 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public String n5() {
      return "font-weight";
   }

   @Override
   public int l6() {
      return 127;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.d2;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      switch (var1.n5()) {
         case 12:
            return l6$n5.n5;
         case 13:
            switch (var1.a6()) {
               case 100:
                  return l6$n5.t2;
               case 200:
                  return l6$n5.n3;
               case 300:
                  return l6$n5.y4;
               case 400:
                  return l6$n5.e2;
               case 500:
                  return l6$n5.t9;
               case 600:
                  return l6$n5.z1;
               case 700:
                  return l6$n5.t4;
               case 800:
                  return l6$n5.q0;
               case 900:
                  return l6$n5.z3;
            }
         default:
            throw com.aspose.slides.internal.z8.u9.n5(var1.n5());
         case 35:
            com.aspose.slides.internal.k5.u9 var3 = this.a6().n5(com.aspose.slides.ms.System.d1.a6(var1.t2()));
            if (var3 == null) {
               throw this.n5(var1.t2());
            } else {
               return var3;
            }
      }
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(
      com.aspose.slides.internal.k5.k7 var1,
      com.aspose.slides.internal.h0.h0 var2,
      String var3,
      com.aspose.slides.internal.y4.z1 var4,
      com.aspose.slides.internal.k5.u9 var5,
      int var6
   ) {
      var5 = super.n5(var1, var2, var3, var4, var5, var6);
      if (var5 == l6$n5.d2) {
         return l6$n5.e2;
      }

      if (var5 == l6$n5.l5) {
         return l6$n5.t4;
      }

      if (var5 == l6$n5.e6) {
         com.aspose.slides.internal.k5.k7 var10 = com.aspose.slides.internal.h0.h0.n5((com.aspose.slides.internal.j3.z3)var1);
         int var11 = 400;
         if (var10 != null) {
            var11 = com.aspose.slides.internal.v6g.k5.u3(((com.aspose.slides.internal.y4.c8)var2.n5(var10, var3, var6)).n5((short)1), 13);
         }

         switch (var11) {
            case 100:
            case 200:
            case 300:
               return l6$n5.e2;
            case 400:
            case 500:
               return l6$n5.t4;
            case 600:
            case 700:
            case 800:
            case 900:
               return l6$n5.z3;
            default:
               return l6$n5.z3;
         }
      } else if (var5 == l6$n5.j0) {
         com.aspose.slides.internal.k5.k7 var7 = com.aspose.slides.internal.h0.h0.n5((com.aspose.slides.internal.j3.z3)var1);
         int var8 = 400;
         if (var7 != null) {
            var8 = com.aspose.slides.internal.v6g.k5.u3(((com.aspose.slides.internal.y4.c8)var2.n5(var7, var3, var6)).n5((short)1), 13);
         }

         switch (var8) {
            case 100:
            case 200:
            case 300:
            case 400:
            case 500:
               return l6$n5.t2;
            case 600:
            case 700:
               return l6$n5.e2;
            case 800:
            case 900:
               return l6$n5.t4;
            default:
               return l6$n5.t2;
         }
      } else {
         return var5;
      }
   }

   static {
      n5.n5("normal", l6$n5.d2);
      n5.n5("bold", l6$n5.l5);
      n5.n5("bolder", l6$n5.e6);
      n5.n5("lighter", l6$n5.j0);
      n5.n5("initial", l6$n5.d2);
   }
}
