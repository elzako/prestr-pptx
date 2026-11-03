package com.aspose.slides.internal.g9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.d1;

public abstract class a6 implements com.aspose.slides.internal.v2.e2 {
   public abstract u3 k5();

   @Override
   public com.aspose.slides.internal.v2.s7 t2() {
      return com.aspose.slides.internal.v2.c8.l6(this.u3());
   }

   public abstract String u3();

   public abstract int a6();

   public static a6 n5(com.aspose.slides.internal.v2.s7 var0) {
      return n5(var0, null);
   }

   public static a6 n5(com.aspose.slides.internal.v2.s7 var0, com.aspose.slides.internal.e7.t2 var1) {
      return n5(var0, var1, false);
   }

   public static a6 n5(com.aspose.slides.internal.v2.s7 var0, com.aspose.slides.internal.e7.t2 var1, boolean var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.u9.class)) {
         com.aspose.slides.internal.v2.u9 var7 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.v2.u9.class);
         return n5(var7.k5(), var1);
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.c8.class)) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.n5.class)) {
            com.aspose.slides.internal.v2.n5 var6 = (com.aspose.slides.internal.v2.n5)var0;
            if (var6.n5() == 0) {
               throw new ArgumentException("Colorspace array is empty");
            } else {
               com.aspose.slides.internal.v2.s7 var8 = var6.l6(0);
               if (!com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.v2.c8.class)) {
                  throw new ArgumentException("First element in colorspace array must be a name");
               } else {
                  com.aspose.slides.internal.v2.c8 var5 = (com.aspose.slides.internal.v2.c8)var8;
                  if (var5 == com.aspose.slides.internal.v2.c8.a3) {
                     return new l6(var6);
                  } else if (var5 == com.aspose.slides.internal.v2.c8.p3) {
                     return new k5(var6);
                  } else if (var5 == com.aspose.slides.internal.v2.c8.a1) {
                     return new x8(var6);
                  } else if (var5 == com.aspose.slides.internal.v2.c8.x1) {
                     return new e2(var6, var1);
                  } else if (var5 == com.aspose.slides.internal.v2.c8.n5u) {
                     return new t4(var6);
                  } else if (var5 == com.aspose.slides.internal.v2.c8.e8) {
                     return y4.n5(var6, var1);
                  } else if (var5 == com.aspose.slides.internal.v2.c8.x6) {
                     return new t9(var6);
                  } else if (var5 == com.aspose.slides.internal.v2.c8.t4r) {
                     return var6.n5() == 1
                        ? new com.aspose.slides.internal.z2.l6((com.aspose.slides.internal.v2.k5)var1.t2())
                        : new com.aspose.slides.internal.z2.l6((com.aspose.slides.internal.v2.k5)var1.t2(), n5(var6.k5(1)));
                  } else if (var5 != com.aspose.slides.internal.v2.c8.f4
                     && var5 != com.aspose.slides.internal.v2.c8.w3
                     && var5 != com.aspose.slides.internal.v2.c8.y9) {
                     throw new ArgumentException("Invalid color space kind: " + var5);
                  } else {
                     return n5(var5, var1, var2);
                  }
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.k5.class)
            && ((com.aspose.slides.internal.v2.k5)var0).n5(com.aspose.slides.internal.v2.c8.f5)) {
            return n5(((com.aspose.slides.internal.v2.k5)var0).u9(com.aspose.slides.internal.v2.c8.f5), var1, var2);
         } else {
            throw new ArgumentException("Expected a name or array but got: " + var0);
         }
      } else {
         com.aspose.slides.internal.v2.c8 var3 = (com.aspose.slides.internal.v2.c8)var0;
         if (var1 != null) {
            com.aspose.slides.internal.v2.c8 var4 = null;
            if (var3.equals(com.aspose.slides.internal.v2.c8.f4) && var1.l6(com.aspose.slides.internal.v2.c8.y5)) {
               var4 = com.aspose.slides.internal.v2.c8.y5;
            } else if (var3.equals(com.aspose.slides.internal.v2.c8.w3) && var1.l6(com.aspose.slides.internal.v2.c8.k8)) {
               var4 = com.aspose.slides.internal.v2.c8.k8;
            } else if (var3.equals(com.aspose.slides.internal.v2.c8.y9) && var1.l6(com.aspose.slides.internal.v2.c8.b5)) {
               var4 = com.aspose.slides.internal.v2.c8.b5;
            }

            if (var1.l6(var4) && !var2) {
               return var1.n5().get_Item(var4.n5());
            }
         }

         if (var3 == com.aspose.slides.internal.v2.c8.f4) {
            return c8.n5;
         }

         if (var3 == com.aspose.slides.internal.v2.c8.w3) {
            return n3.n5;
         }

         if (var3 == com.aspose.slides.internal.v2.c8.y9) {
            return s7.n5;
         }

         if (var3 == com.aspose.slides.internal.v2.c8.t4r) {
            return new com.aspose.slides.internal.z2.l6((com.aspose.slides.internal.v2.k5)var1.t2());
         }

         if (var1 != null) {
            if (!var1.l6(var3)) {
               throw new ArgumentException(d1.n5(new String[]{"Missing color space: ", var3.n5()}));
            } else {
               return var1.n5().get_Item(var3.n5());
            }
         } else {
            throw new ArgumentException(d1.n5(new String[]{"Unknown color space: ", var3.n5()}));
         }
      }
   }

   public abstract float[] n5(float[] var1);
}
