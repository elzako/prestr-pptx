package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class j4u {
   static com.aspose.slides.internal.s6.w1 n5() {
      com.aspose.slides.internal.s6.w1 var0 = com.aspose.slides.internal.s6.w1.h0();
      var0.n5(new com.aspose.slides.internal.s6.v3(0.3F, 0.3F, 0.3F));
      var0.k5(new com.aspose.slides.internal.s6.v3(1.5F, -1.0F, -2.0F).u9().h0());
      var0.u3(new com.aspose.slides.internal.s6.v3(0.3F));
      var0.n5(5.0F);
      return var0;
   }

   static List<com.aspose.slides.internal.s6.w1> n5(x2i var0) {
      return n5(var0, false);
   }

   static List<com.aspose.slides.internal.s6.w1> n5(x2i var0, boolean var1) {
      int var2 = var0.s7();
      int var3 = var0.u9();
      if (var2 >= 17 && var2 <= 20) {
         return j5(var0);
      }

      if (var2 >= 13 && var2 <= 16) {
         return z8(var0);
      }

      if (var2 >= 10 && var2 <= 12) {
         return w1(var0);
      }

      if (var2 == 22) {
         return z3(var0);
      }

      if (var2 == 8) {
         return t9(var0);
      }

      if (var2 == 0) {
         if (var3 == 10) {
            return a6(var0);
         } else if (var3 == 8) {
            return t4(var0);
         } else {
            return var3 == 7 ? q0(var0) : z1(var0);
         }
      } else {
         if (var2 == 26) {
            return var0.u9() == 7 ? m1(var0) : k7(var0);
         }

         if (var2 == 2) {
            return var0.u9() == 1 ? e2(var0) : y4(var0);
         }

         if (var2 == 3) {
            return var3 == 8 ? n3(var0) : m3(var0);
         }

         if (var2 == 25) {
            if (var3 == 14 && var1) {
               return c8(var0);
            } else {
               return var3 == 7 ? t2(var0) : s7(var0);
            }
         } else {
            if (var2 == 1 && var3 == 9 && var1) {
               return x8(var0);
            }

            if (var2 == 7) {
               return var3 == 2 ? h0(var0) : u9(var0);
            }

            if (var2 == 4) {
               if (var3 == 7) {
                  return u3(var0);
               }

               if (var3 == 9) {
                  return k5(var0);
               }
            }

            if (var2 == 5) {
               return l6(var0);
            }

            List var4 = new List();
            var4.addItem(n5());
            return var4;
         }
      }
   }

   private static List<com.aspose.slides.internal.s6.w1> l6(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.16F, 0.16F, 0.16F));
      var1.k5(new com.aspose.slides.internal.s6.v3(1.5F, -1.0F, -2.0F).u9().h0());
      var1.u3(new com.aspose.slides.internal.s6.v3(0.3F));
      var1.n5(2.0F);
      int var2 = var0.t2();
      switch (var2) {
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 0.0F, -0.7F).u9().h0());
         default:
            List var3 = new List();
            var3.addItem(var1);
            return var3;
      }
   }

   private static List<com.aspose.slides.internal.s6.w1> k5(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.7F, 0.7F, 0.7F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.6F));
      var1.n5(8.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -0.5F, -0.5F).u9().h0());
      List var2 = new List();
      var2.addItem(var1);
      return var2;
   }

   private static List<com.aspose.slides.internal.s6.w1> u3(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.7F, 0.7F, 0.7F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.6F));
      var1.n5(8.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -0.5F, -1.0F).u9().h0());
      List var2 = new List();
      var2.addItem(var1);
      return var2;
   }

   private static List<com.aspose.slides.internal.s6.w1> a6(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.6F, 0.6F, 0.6F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.35F));
      var1.n5(3.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -1.0F, -1.0F).u9().h0());
      if (var0.t2() == 0) {
         var1.k5(new com.aspose.slides.internal.s6.v3(0.7F, -1.0F, -1.2F).u9().h0());
      }

      if (a0(var0)) {
         com.aspose.slides.internal.s6.r4 var2 = n5(var0.x8()).c8();
         var1.k5(var2.n5(var1.k5().h0()).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> u9(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = com.aspose.slides.internal.s6.w1.h0();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.5F, 0.5F, 0.5F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.3F));
      var1.n5(5.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 0.0F, -0.5F).u9().h0());
      if (var0.x8() != null) {
         com.aspose.slides.internal.s6.r4 var2 = n5(var0.x8()).c8();
         var1.k5(var2.n5(var1.k5().h0()).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> h0(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = com.aspose.slides.internal.s6.w1.h0();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.7F, 0.7F, 0.7F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.5F));
      var1.n5(8.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, -0.5F).u9().h0());
      if (var0.x8() != null) {
         com.aspose.slides.internal.s6.r4 var2 = n5(var0.x8()).c8();
         var1.k5(var2.n5(var1.k5().h0()).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> c8(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      if (var0.t2() == 1) {
         var1.n5(new com.aspose.slides.internal.s6.v3(0.5F, 0.5F, 0.5F));
         var1.u3(new com.aspose.slides.internal.s6.v3(0.25F));
         var1.n5(8.0F);
         var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -0.5F, -0.6F).u9().h0());
      }

      List var2 = new List();
      var2.addItem(var1);
      return var2;
   }

   private static List<com.aspose.slides.internal.s6.w1> t2(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.12F, 0.12F, 0.12F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.1F));
      var1.n5(4.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.6F, 0.4F, -1.35F).u9().h0());
      com.aspose.slides.internal.s6.w1 var2 = n5();
      var2.n5(new com.aspose.slides.internal.s6.v3(0.12F, 0.12F, 0.12F));
      var2.u3(new com.aspose.slides.internal.s6.v3(0.05F));
      var2.n5(2.0F);
      var2.k5(new com.aspose.slides.internal.s6.v3(0.6F, 0.4F, -1.35F).u9().h0());
      switch (var0.t2()) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
            var2.k5(new com.aspose.slides.internal.s6.v3(0.5F, 1.0F, -1.0F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.6F, -0.6F, -1.1F).u9().h0());
            var2.k5(new com.aspose.slides.internal.s6.v3(-0.4F, 0.7F, 0.5F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.6F, -1.0F, -1.1F).u9().h0());
            var2.k5(new com.aspose.slides.internal.s6.v3(-0.4F, 1.1F, 0.5F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.5F, -1.3F, -1.1F).u9().h0());
            var2.k5(new com.aspose.slides.internal.s6.v3(-0.3F, 1.4F, 0.5F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.1F, -1.0F, -1.1F).u9().h0());
            var2.k5(new com.aspose.slides.internal.s6.v3(0.1F, 1.1F, 0.5F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.1F, -0.6F, -1.1F).u9().h0());
            var2.k5(new com.aspose.slides.internal.s6.v3(0.1F, 0.7F, 0.5F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.1F, -0.2F, -1.1F).u9().h0());
            var2.k5(new com.aspose.slides.internal.s6.v3(0.1F, 0.3F, 0.5F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.5F, 0.1F, -1.1F).u9().h0());
            var2.k5(new com.aspose.slides.internal.s6.v3(-0.3F, 0.0F, 0.5F).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      var3.addItem(var2);
      if (a0(var0)) {
         com.aspose.slides.internal.s6.r4 var4 = n5(var0.x8()).c8();
         List$Enumerator var5 = var3.iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.s6.w1 var6 = (com.aspose.slides.internal.s6.w1)var5.next();
               var6.k5(var4.n5(var6.k5().h0()).u9().h0());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> s7(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      if (a0(var0)) {
         var1.n5(new com.aspose.slides.internal.s6.v3(0.7F, 0.7F, 0.7F));
         var1.u3(new com.aspose.slides.internal.s6.v3(0.5F));
         var1.n5(8.0F);
         var1.k5(new com.aspose.slides.internal.s6.v3(0.5F, -1.0F, -1.0F).u9().h0());
         com.aspose.slides.internal.s6.r4 var4 = n5(var0.x8()).c8();
         var1.k5(var4.n5(var1.k5().h0()).u9().h0());
         List var3 = new List();
         var3.addItem(var1);
         return var3;
      } else {
         List var2 = new List();
         var2.addItem(var1);
         return var2;
      }
   }

   private static List<com.aspose.slides.internal.s6.w1> x8(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      if (var0.t2() == 1) {
         var1.n5(new com.aspose.slides.internal.s6.v3(0.8F, 0.8F, 0.8F));
         var1.u3(new com.aspose.slides.internal.s6.v3(0.35F));
         var1.n5(6.0F);
         var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
      }

      List var2 = new List();
      var2.addItem(var1);
      return var2;
   }

   private static List<com.aspose.slides.internal.s6.w1> n3(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.7F, 0.7F, 0.7F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.45F));
      var1.n5(20.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
      if (var0.x8() != null) {
         com.aspose.slides.internal.s6.v3 var5 = new com.aspose.slides.internal.s6.v3(1.0F, 0.0F, -0.9F);
         com.aspose.slides.internal.s6.r4 var6 = n5(var0.x8()).c8();
         var1.k5(var6.n5(var5.h0()).u9().h0());
         List var4 = new List();
         var4.addItem(var1);
         return var4;
      }

      int var2 = var0.t2();
      switch (var2) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -0.5F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.5F, 0.3F, -1.0F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -0.5F, -1.0F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 0.0F, -1.0F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 1.0F, -1.0F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, -1.0F).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> y4(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.6F, 0.6F, 0.6F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.2F));
      var1.n5(16.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
      switch (var0.t2()) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, -0.6F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -1.0F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 0.0F, -1.0F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 1.0F, -1.0F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 1.0F, -1.0F).u9().h0());
      }

      if (var0.x8() != null) {
         com.aspose.slides.internal.s6.r4 var2 = n5(var0.x8()).c8();
         var1.k5(var2.n5(var1.k5().h0()).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> e2(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.6F, 0.6F, 0.6F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.2F));
      var1.n5(10.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
      if (var0.t2() == 1) {
         var1.k5(new com.aspose.slides.internal.s6.v3(-0.3F, -0.2F, -0.25F).u9().h0());
      }

      if (var0.x8() != null) {
         com.aspose.slides.internal.s6.r4 var2 = n5(var0.x8()).c8();
         var1.k5(var2.n5(var1.k5().h0()).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> t9(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.3F, 0.3F, 0.3F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.7F));
      var1.n5(12.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
      switch (var0.t2()) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -0.8F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.8F, -0.8F, -0.8F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -1.0F, -0.8F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, -0.8F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -0.8F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 0.0F, -0.8F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 1.0F, -0.8F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, -0.8F).u9().h0());
      }

      if (var0.x8() != null) {
         com.aspose.slides.internal.s6.r4 var2 = n5(var0.x8()).c8();
         var1.k5(var2.n5(var1.k5().h0()).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> z1(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.7F, 0.7F, 0.7F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.5F));
      var1.n5(8.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -1.0F, -1.0F).u9().h0());
      int var2 = var0.t2();
      switch (var2) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -1.0F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 0.7F, -1.0F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -0.5F, -1.0F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 0.0F, -1.0F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 1.0F, -1.0F).u9().h0());
      }

      if (a0(var0)) {
         com.aspose.slides.internal.s6.r4 var3 = n5(var0.x8()).c8();
         var1.k5(var3.n5(var1.k5().h0()).u9().h0());
      }

      List var4 = new List();
      var4.addItem(var1);
      return var4;
   }

   private static List<com.aspose.slides.internal.s6.w1> t4(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.2F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.55F));
      var1.n5(8.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -1.0F, -1.0F).u9().h0());
      com.aspose.slides.internal.s6.w1 var2 = ((com.aspose.slides.internal.s6.w1)var1.deepClone()).u9();
      com.aspose.slides.internal.s6.w1 var3 = ((com.aspose.slides.internal.s6.w1)var1.deepClone()).u9();
      var3.u3(new com.aspose.slides.internal.s6.v3(0.45F));
      var3.n5(10.0F);
      int var4 = var0.t2();
      switch (var4) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -1.0F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.4F, 0.5F, -0.7F).u9().h0());
            var3.k5(new com.aspose.slides.internal.s6.v3(-0.45F, 0.07F, 0.53F).u9().h0());
            var2.k5(new com.aspose.slides.internal.s6.v3(-0.28F, -0.9F, 0.1F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -0.5F, -1.0F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 0.0F, -1.0F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 1.0F, -1.0F).u9().h0());
      }

      List var5 = new List();
      var5.addItem(var1);
      var5.addItem(var2);
      var5.addItem(var3);
      if (a0(var0)) {
         com.aspose.slides.internal.s6.r4 var6 = n5(var0.x8()).c8();
         List$Enumerator var7 = var5.iterator();

         try {
            while (var7.hasNext()) {
               com.aspose.slides.internal.s6.w1 var8 = (com.aspose.slides.internal.s6.w1)var7.next();
               var8.k5(var6.n5(var8.k5().h0()).u9().h0());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      }

      return var5;
   }

   private static List<com.aspose.slides.internal.s6.w1> q0(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.3F, 0.3F, 0.3F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.15F));
      var1.n5(3.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.4F, 0.25F, -0.55F).u9().h0());
      com.aspose.slides.internal.s6.w1 var2 = ((com.aspose.slides.internal.s6.w1)var1.deepClone()).u9();
      var2.n5(new com.aspose.slides.internal.s6.v3(0.4F, 0.4F, 0.4F));
      var2.u3(new com.aspose.slides.internal.s6.v3(0.2F));
      var2.n5(6.0F);
      var2.k5(new com.aspose.slides.internal.s6.v3(-0.28F, -0.3F, 0.18F).u9().h0());
      List var3 = new List();
      var3.addItem(var1);
      var3.addItem(var2);
      if (a0(var0)) {
         com.aspose.slides.internal.s6.r4 var4 = n5(var0.x8()).c8();
         List$Enumerator var5 = var3.iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.s6.w1 var6 = (com.aspose.slides.internal.s6.w1)var5.next();
               var6.k5(var4.n5(var6.k5().h0()).u9().h0());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> z3(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.55F, 0.55F, 0.55F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.2F));
      var1.n5(8.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
      switch (var0.t2()) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, -1.2F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 0.0F, -1.2F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 0.0F, -1.2F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, -1.0F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, -1.0F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 0.0F, -1.2F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 0.0F, -1.2F).u9().h0());
      }

      if (var0.x8() != null) {
         com.aspose.slides.internal.s6.r4 var2 = n5(var0.x8()).c8();
         var1.k5(var2.n5(var1.k5().h0()).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> m1(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.5F, 0.5F, 0.5F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.4F));
      var1.n5(12.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
      if (var0.t2() == 1) {
         var1.k5(new com.aspose.slides.internal.s6.v3(0.35F, 1.0F, -0.6F).u9().h0());
      }

      if (var0.x8() != null) {
         com.aspose.slides.internal.s6.r4 var2 = n5(var0.x8()).c8();
         var1.k5(var2.n5(var1.k5().h0()).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> k7(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.5F, 0.5F, 0.5F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.4F));
      var1.n5(12.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
      int var2 = var0.t2();
      switch (var2) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, -1.0F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -1.0F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 0.0F, -1.0F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 0.0F, -1.0F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 1.0F, -1.0F).u9().h0());
      }

      if (var0.x8() != null) {
         com.aspose.slides.internal.s6.r4 var3 = n5(var0.x8()).c8();
         var1.k5(var3.n5(var1.k5().h0()).u9().h0());
      }

      List var4 = new List();
      var4.addItem(var1);
      return var4;
   }

   private static List<com.aspose.slides.internal.s6.w1> m3(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.85F, 0.85F, 0.85F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.3F));
      var1.n5(8.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
      com.aspose.slides.internal.s6.w1 var2 = ((com.aspose.slides.internal.s6.w1)var1.deepClone()).u9();
      var1.k5(new com.aspose.slides.internal.s6.v3(2.0F, 0.0F, -0.5F).u9().h0());
      var2.k5(new com.aspose.slides.internal.s6.v3(-2.0F, 0.0F, -0.5F).u9().h0());
      List var3 = new List();
      var3.addItem(var1);
      var3.addItem(var2);
      if (var0.x8() != null) {
         com.aspose.slides.internal.s6.r4 var4 = n5(var0.x8()).c8();
         List$Enumerator var5 = var3.iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.s6.w1 var6 = (com.aspose.slides.internal.s6.w1)var5.next();
               var6.k5(var4.n5(var6.k5().h0()).u9().h0());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> z8(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.2F, 0.2F, 0.2F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.35F));
      var1.n5(8.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F).u9().h0());
      int var2 = var0.t2();
      int var3 = var0.s7();
      if (var3 == 14) {
         switch (var2) {
            case 0:
               var1.k5(new com.aspose.slides.internal.s6.v3(1.5F, 0.0F, -1.0F).u9().h0());
               break;
            case 1:
               var1.k5(new com.aspose.slides.internal.s6.v3(0.8F, -1.0F, -1.0F).u9().h0());
               break;
            case 2:
               var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.5F, -1.0F).u9().h0());
               break;
            case 3:
               var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
               break;
            case 4:
               var1.k5(new com.aspose.slides.internal.s6.v3(-1.5F, 0.0F, -1.0F).u9().h0());
               break;
            case 5:
               var1.k5(new com.aspose.slides.internal.s6.v3(-0.5F, 0.5F, -1.0F).u9().h0());
               break;
            case 6:
               var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.5F, -1.0F).u9().h0());
               break;
            case 7:
               var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -1.0F).u9().h0());
         }
      }

      if (var3 == 15) {
         switch (var2) {
            case 0:
               var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, 1.0F).u9().h0());
               break;
            case 1:
               var1.k5(new com.aspose.slides.internal.s6.v3(1.4F, 0.0F, -1.0F).u9().h0());
               break;
            case 2:
               var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -1.0F, -1.0F).u9().h0());
               break;
            case 3:
               var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -0.7F, -1.3F).u9().h0());
               break;
            case 4:
               var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
               break;
            case 5:
               var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 0.0F, -1.0F).u9().h0());
               break;
            case 6:
               var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 1.0F, -1.0F).u9().h0());
               break;
            case 7:
               var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.5F, -1.0F).u9().h0());
         }
      }

      List var4 = new List();
      var4.addItem(var1);
      return var4;
   }

   private static List<com.aspose.slides.internal.s6.w1> j5(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.35F, 0.35F, 0.35F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.35F));
      var1.n5(15.0F);
      var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F));
      int var2 = var0.t2();
      int var3 = var0.s7();
      if (var3 == 18) {
         switch (var2) {
            case 0:
               var1.k5(new com.aspose.slides.internal.s6.v3(1.5F, 0.0F, -1.0F).u9().h0());
               break;
            case 1:
               var1.k5(new com.aspose.slides.internal.s6.v3(0.8F, -1.0F, -1.0F).u9().h0());
               break;
            case 2:
               var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.5F, -1.0F).u9().h0());
               break;
            case 3:
               var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
               break;
            case 4:
               var1.k5(new com.aspose.slides.internal.s6.v3(-1.5F, 0.0F, -1.0F).u9().h0());
               break;
            case 5:
               var1.k5(new com.aspose.slides.internal.s6.v3(-0.5F, 0.5F, -1.0F).u9().h0());
               break;
            case 6:
               var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.5F, -1.0F).u9().h0());
               break;
            case 7:
               var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -1.0F).u9().h0());
         }

         List var6 = new List();
         var6.addItem(var1);
         return var6;
      } else if (var3 == 19) {
         switch (var2) {
            case 0:
               var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, 1.0F).u9().h0());
               break;
            case 1:
               var1.k5(new com.aspose.slides.internal.s6.v3(1.4F, 0.0F, -1.0F).u9().h0());
               break;
            case 2:
               var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -1.0F, -1.0F).u9().h0());
               break;
            case 3:
               var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -0.7F, -1.3F).u9().h0());
               break;
            case 4:
               var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
               break;
            case 5:
               var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 0.0F, -1.0F).u9().h0());
               break;
            case 6:
               var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, 1.0F, -1.0F).u9().h0());
               break;
            case 7:
               var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.5F, -1.0F).u9().h0());
         }

         List var5 = new List();
         var5.addItem(var1);
         return var5;
      } else {
         List var4 = new List();
         var4.addItem(var1);
         return var4;
      }
   }

   private static List<com.aspose.slides.internal.s6.w1> w1(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      int var2 = var0.s7();
      if (var2 == 10) {
         return var0.u9() == 3 ? y1(var0) : r4(var0);
      }

      if (var2 == 11) {
         return c4(var0);
      }

      if (var2 == 12) {
         return y2(var0);
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> r4(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      int var2 = var0.t2();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.2F, 0.2F, 0.2F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.1F));
      var1.n5(8.0F);
      switch (var2) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.5F, 0.0F, -1.0F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.8F, 0.7F, -0.7F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.5F, -1.0F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.5F, 0.0F, -1.0F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(-0.8F, -0.5F, -0.7F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.5F, -1.0F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -1.0F).u9().h0());
            break;
         default:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F));
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> c4(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      int var2 = var0.t2();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.2F, 0.2F, 0.2F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.1F));
      var1.n5(8.0F);
      switch (var2) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -1.0F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.3F, 0.4F, -1.0F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.8F, -1.0F, -1.0F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.5F, -1.0F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.2F, -0.5F, -1.0F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(-0.5F, 0.5F, -1.0F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.5F, -1.0F).u9().h0());
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> y2(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      int var2 = var0.t2();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.2F, 0.2F, 0.2F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.1F));
      var1.n5(8.0F);
      switch (var2) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.5F, -1.0F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, -0.6F, -1.0F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.5F, 0.0F, -1.0F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.8F, -1.0F, -1.0F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.5F, -1.0F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(-0.8F, 0.5F, -0.7F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.5F, 0.0F, -1.0F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(-0.5F, 0.5F, -1.0F).u9().h0());
            break;
         default:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F));
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static List<com.aspose.slides.internal.s6.w1> y1(x2i var0) {
      com.aspose.slides.internal.s6.w1 var1 = n5();
      int var2 = var0.t2();
      var1.n5(new com.aspose.slides.internal.s6.v3(0.05F, 0.05F, 0.05F));
      var1.u3(new com.aspose.slides.internal.s6.v3(0.0F));
      var1.n5(0.0F);
      switch (var2) {
         case 0:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.5F, 0.0F, -1.0F).u9().h0());
            break;
         case 1:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.2F, 0.15F, -0.25F).u9().h0());
            break;
         case 2:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, -1.5F, -1.0F).u9().h0());
            break;
         case 3:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.0F, -1.0F, -1.0F).u9().h0());
            break;
         case 4:
            var1.k5(new com.aspose.slides.internal.s6.v3(-1.5F, 0.0F, -1.0F).u9().h0());
            break;
         case 5:
            var1.k5(new com.aspose.slides.internal.s6.v3(-0.8F, -0.5F, -0.7F).u9().h0());
            break;
         case 6:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 1.5F, -1.0F).u9().h0());
            break;
         case 7:
            var1.k5(new com.aspose.slides.internal.s6.v3(1.0F, 1.0F, -1.0F).u9().h0());
            break;
         default:
            var1.k5(new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F));
      }

      List var3 = new List();
      var3.addItem(var1);
      return var3;
   }

   private static boolean a0(x2i var0) {
      if (var0 == null) {
         throw new ArgumentNullException("shape3DBaseSettings");
      }

      if (var0.x8() != null) {
         for (int var1 = 0; var1 < var0.x8().length; var1++) {
            if (var0.x8()[var1] != 0.0F) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static com.aspose.slides.internal.s6.r4 n5(float[] var0) {
      com.aspose.slides.internal.s6.r4 var1 = com.aspose.slides.internal.s6.r4.n5(com.aspose.slides.internal.s6.w2.n5(var0[0])).c8();
      com.aspose.slides.internal.s6.r4 var2 = com.aspose.slides.internal.s6.r4.l6(com.aspose.slides.internal.s6.w2.n5(var0[1])).c8();
      com.aspose.slides.internal.s6.r4 var3 = com.aspose.slides.internal.s6.r4.k5(-com.aspose.slides.internal.s6.w2.n5(var0[2])).c8();
      return com.aspose.slides.internal.s6.r4.n5(com.aspose.slides.internal.s6.r4.n5(var2, var1), var3);
   }
}
