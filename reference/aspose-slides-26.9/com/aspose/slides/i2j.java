package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class i2j {
   private String n5;
   private int l6;
   private boolean k5;
   private static final List<String> u3 = new List<>();

   private i2j(String var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public static e4z n5(String var0, int var1, com.aspose.slides.internal.e1x.r4 var2, boolean var3, float var4, byte var5, int var6, boolean var7) {
      return new i2j(var0, var1).n5(var2, var3, var4, var5, var6, var7);
   }

   private e4z n5(com.aspose.slides.internal.e1x.r4 var1, boolean var2, float var3, byte var4, int var5, boolean var6) {
      int var7 = this.l6;
      String var8 = this.n5;
      if (this.n5 == null) {
         this.n5 = "";
      }

      com.aspose.slides.internal.e1x.i1 var9 = this.n5(var1, var6);
      if (var9 == null) {
         return null;
      }

      com.aspose.slides.internal.p1s.l6 var10 = new com.aspose.slides.internal.p1s.l6(var3 * 4.0F / 3.0F, this.l6, var9, var2 ? 2 : 1);
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, e6s.class)) {
         this.n5(var9);
      }

      com.aspose.slides.internal.o9b.n3 var11 = var1.n5(var10.h0(), var3, this.l6);
      if (var11 == null) {
         var11 = var1.n5(this.n5, var3, this.l6);
      }

      if ((var11 == null || !com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.e1x.n5.class) && !var9.n5(var11.l6().a6(), true)) && !var6) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.e1x.f2.class)
            && com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var9.u9()), ".otf")
            && !FontsLoader.n5(var9.u3())) {
            try {
               byte[] var12 = com.aspose.slides.internal.z0k.u9.h0(var9.u9());
               if ("OTTO".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var12, 0, 4))) {
                  byte[] var13 = com.aspose.slides.internal.c8e.n5.n5(var12);
                  FontsLoader.loadExternalFont(var13);
               }
            } catch (RuntimeException var14) {
               com.aspose.slides.internal.n8e.v4.n5(var14);
            }
         }

         return null;
      } else {
         return new e4z(var8, var4, var5, var3, var7, var2, !var6, var10, var11, this.k5);
      }
   }

   private com.aspose.slides.internal.e1x.i1 n5(com.aspose.slides.internal.e1x.r4 var1, boolean var2) {
      com.aspose.slides.internal.e1x.i1 var3 = n5(var1, var2, this.n5, this.l6);
      if (var3 != null) {
         return var3;
      }

      if (com.aspose.slides.ms.System.d1.t2(this.n5, " ")) {
         String var4 = null;
         int var5 = 0;
         String[] var6 = new String[]{var4};
         int[] var7 = new int[]{0};
         boolean var8 = n5(this.n5, var6, var7);
         var4 = var6[0];
         var5 = var7[0];
         if (var8) {
            String var9 = com.aspose.slides.ms.System.d1.n5(this.n5, var5, var4.length());
            int var10 = com.aspose.slides.ms.System.d1.t2(var4, "bold") ? this.l6 | 1 : this.l6;
            var3 = n5(var1, var2, var9, var10);
            if (var3 != null) {
               this.n5 = var9;
               this.l6 = var10;
               return var3;
            }

            var5 = com.aspose.slides.ms.System.d1.k5(var9, ' ');
            if (var5 > -1) {
               var4 = com.aspose.slides.ms.System.d1.k5(var9, var5);
               int var11 = 0;
               int[] var12 = new int[]{0};
               boolean var13 = com.aspose.slides.ms.System.a3.n5(var4, var12);
               var11 = var12[0];
               if (var13) {
                  var9 = com.aspose.slides.ms.System.d1.n5(var9, var5);
                  var3 = n5(var1, var2, var9, var10);
                  if (var3 != null) {
                     this.n5 = var9;
                     this.l6 = var10;
                     return var3;
                  }
               }
            }
         } else {
            com.aspose.slides.internal.l7h.a5 var37 = new com.aspose.slides.internal.l7h.a5();
            var37.n5(this.n5);
            var37.n5(' ');
            var37.n5(com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.o9b.e2.class, this.l6));

            for (int var39 = 0; var39 < var37.l6(); var39++) {
               if (var37.l6(var39) == ',') {
                  var37.l6(var39--, 1);
               }
            }

            String var40 = var37.toString();
            var3 = n5(var1, var2, var40, this.l6);
            if (var3 != null) {
               this.n5 = var40;
               return var3;
            }

            var40 = com.aspose.slides.ms.System.d1.n5(this.n5, " ", com.aspose.slides.ms.System.d1.n5);
            var3 = n5(var1, var2, var40, this.l6);
            if (var3 != null) {
               this.n5 = var40;
               return var3;
            }
         }
      }

      if (com.aspose.slides.ms.System.d1.t2(this.n5, "-")) {
         String var23 = null;
         String[] var28 = new String[]{var23};
         String var30 = com.aspose.slides.internal.c8e.n5.n5(this.n5, var28);
         var23 = var28[0];
         int var32 = com.aspose.slides.ms.System.d1.t2(var23, "Bold") ? this.l6 | 1 : this.l6;
         var32 |= com.aspose.slides.ms.System.d1.t2(var23, "Italic") ? this.l6 | 2 : var32;
         var3 = n5(var1, var2, var30, var32);
         if (var3 != null) {
            this.n5 = var30;
            this.l6 = var32;
            return var3;
         }
      }

      if (!com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(this.n5), "unicode")) {
         var3 = n5(var1, var2, com.aspose.slides.ms.System.d1.n5(this.n5, " Unicode"), this.l6);
         if (var3 != null) {
            this.n5 = com.aspose.slides.ms.System.d1.n5(this.n5, " Unicode");
            return var3;
         }
      }

      String[] var25 = new String[]{" (Body)", " (Headings)", " Regular"};
      String var29 = null;

      for (String var38 : var25) {
         if (com.aspose.slides.ms.System.d1.l6(this.n5, var38, (short)5)) {
            var29 = com.aspose.slides.ms.System.d1.l6(this.n5, 0, this.n5.length() - var38.length());
            break;
         }
      }

      if (var29 != null) {
         var3 = n5(var1, var2, var29, this.l6);
         if (var3 != null) {
            this.n5 = var29;
            return var3;
         }
      }

      return null;
   }

   private static com.aspose.slides.internal.e1x.i1 n5(com.aspose.slides.internal.e1x.r4 var0, boolean var1, String var2, int var3) {
      return var1 ? com.aspose.slides.internal.e1x.f2.n5().n5(var2, var3, null) : var0.n5(var2, var3);
   }

   private void n5(com.aspose.slides.internal.e1x.i1 var1) {
      int var2 = (var1.c8() ^ this.l6) & 3;
      if ((var2 & 1) == 1 && (this.l6 & 1) == 1) {
         this.k5 = true;
         this.l6 &= -2;
      }
   }

   private static boolean n5(String var0, String[] var1, int[] var2) {
      var1[0] = null;
      var2[0] = -1;
      String var3 = com.aspose.slides.ms.System.d1.u9(var0);
      List$Enumerator var4 = u3.iterator();

      try {
         while (var4.hasNext()) {
            String var5 = (String)var4.next();
            if (com.aspose.slides.ms.System.d1.t2(var3, var5)) {
               var1[0] = var5;
               var2[0] = com.aspose.slides.ms.System.d1.c8(var3, var5);
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return false;
   }

   static {
      u3.addItem(" hairline");
      u3.addItem(" ultralight");
      u3.addItem(" extralight");
      u3.addItem(" light");
      u3.addItem(" normal");
      u3.addItem(" medium");
      u3.addItem(" demibold");
      u3.addItem(" bold");
      u3.addItem(" ultrabold");
      u3.addItem(" extrabold");
      u3.addItem(" heavy");
      u3.addItem(" condensed");
      u3.addItem(" semicondensed");
      u3.addItem(" semibold");
      u3.addItem(" semilight");
   }
}
