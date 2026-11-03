package com.aspose.slides.internal.f5n;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.b5j.h0;
import com.aspose.slides.internal.b5j.t9;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.d0e.a6;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.k5.j5;
import com.aspose.slides.internal.k5.q0;
import com.aspose.slides.internal.k5.z8;
import com.aspose.slides.internal.l5.n3;
import com.aspose.slides.internal.l5.x8;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class k5 {
   private static final String n5 = d1.n5(new String[]{
      ",width,height,opacity,cap-height,rotate,text-anchor,view-clip-id,color,visibility,display,xml:base,",
      "font-family,font-style,font-size,font-weight,font-variant,glyph-orientation-horizontal,glyph-orientation-vertical,",
      ",fill,fill-rule,fill-opacity,",
      ",stroke,stroke-width,stroke-opacity,stroke-linejoin,stroke-miterlimit,stroke-dasharray,stroke-dashoffset,stroke-linecap,",
      ",marker-start,marker-mid,marker-end,"
   });
   private static final u9 l6 = new u9("bevel", "round");

   public static void n5(t2 var0) {
      n5(var0, false);
   }

   public static void n5(t2 var0, boolean var1) {
      if (var1
         || !com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.d8v.n5.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.u3t.n5.class)
            && !com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.d8v.u9.class)) {
         String[] var2 = new String[]{"fill", "stroke", "stop-color", "flood-color", "lighting-color"};

         for (String var6 : var2) {
            if (var0.l6.n5(var6) && "currentColor".equals(var0.l6.k5(var6))) {
               var0.l6.l6(var6, var0.l6.n5("color") ? var0.l6.k5("color") : "black");
            }
         }

         IGenericEnumerator var24 = var0.l6.iterator();

         try {
            while (var24.hasNext()) {
               KeyValuePair var25 = (KeyValuePair)var24.next();
               String var27 = (String)var25.getKey();
               String var29 = (String)var25.getValue();
               if (t4.n5(n5, d1.n5(new String[]{",", var27, ","}), true)) {
                  if (!"style".equals(var25.getKey()) && !"class".equals(var25.getKey())) {
                     n5(var0, var27, var29);
                  } else {
                     String var7 = d1.n5;
                     if ("style".equals(var25.getKey())) {
                        var7 = (String)var25.getValue();
                     } else if ("class".equals(var25.getKey())) {
                        var7 = new h0().l6((String)var25.getValue());
                     }

                     String[] var8 = d1.n5(var7, new String[]{";"}, 1);

                     for (String var12 : var8) {
                        String[] var13 = d1.n5(var12, new String[]{":"}, 1);
                        if (var13.length >= 2) {
                           String var14 = d1.l6(var13[0]);
                           String var15 = d1.l6(var13[1]);
                           n5(var0, var14, var15);
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
               var24.dispose();
            }
         }

         IGenericEnumerator var26 = var0.j5().iterator();

         try {
            while (var26.hasNext()) {
               KeyValuePair var28 = (KeyValuePair)var26.next();
               n5((t2)var28.getValue(), var1);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
               var26.dispose();
            }
         }
      }
   }

   public static void n5(t2 var0, String var1, String var2) {
      IGenericEnumerator var3 = var0.j5().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            if (!((t2)var4.getValue()).l6.n5(var1) || d1.u3("inherit", ((t2)var4.getValue()).l6.k5(var1), (short)3)) {
               ((t2)var4.getValue()).l6.l6(var1, var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   public static void n5(a0 var0, y1 var1, com.aspose.slides.internal.w9s.u3 var2, t2 var3, f2 var4) {
      if (!var1.u3()) {
         if (var3.y2()) {
            m1 var5 = var2.h0().n5(var3.c4(), var4.a6());
            s7 var6 = new s7();

            try {
               var6.l6(var1.y4());
               var6.l6(var5);
               var6.s7().a6(var1);
            } finally {
               if (var6 != null) {
                  var6.dispose();
               }
            }
         }

         var0.k5(var1.y4());
      }
   }

   public static void n5(a0 var0, s7 var1, com.aspose.slides.internal.w9s.u3 var2, t2 var3, f2 var4) {
      if (var1.h0() > 0) {
         if (var3.y2()) {
            m1 var5 = var2.h0().n5(var3.c4(), var4.a6());
            var1.l6(var5);
         }

         y1 var6 = var1.s7().y4();
         if (!(var6.s7() < 1.0F) && !(var6.k5() < 1.0F)) {
            var0.k5(var1);
         }
      }
   }

   public static List<com.aspose.slides.internal.k5.n5> n5(j5 var0, String var1, String var2) {
      List var3 = new List();
      if (!d1.n5(var1) && d1.n5(var2) && var0 != null) {
         String[] var4 = d1.n5(d1.l6(var1), ' ');
         IGenericEnumerator var5 = var0.l6().iterator();

         try {
            while (var5.hasNext()) {
               q0 var6 = (q0)var5.next();
               z8 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, z8.class);
               if (var7 != null && var7.u9() != null) {
                  String[] var8 = d1.n5(d1.l6(var7.k5()), ',');

                  for (String var12 : var4) {
                     for (String var16 : var8) {
                        if (d1.a6(d1.n5(new String[]{".", var12}), d1.l6(var16))) {
                           var3.addItem(new com.aspose.slides.internal.k5.n5(var7.u9()));
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      return var3;
   }

   public static void n5(com.aspose.slides.internal.w9s.u3 var0, s7 var1, t2 var2, f2 var3) {
      a6 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, a6.class);
      List var5 = n5(var0.u9().n5(), var4.u9(), var4.a6());
      List$Enumerator var6 = var5.iterator();

      try {
         while (var6.hasNext()) {
            com.aspose.slides.internal.k5.n5 var7 = (com.aspose.slides.internal.k5.n5)var6.next();
            if (d1.u3("hidden", var7.h9(), (short)3) || d1.u3("collapse", var7.h9(), (short)3)) {
               return;
            }

            if (d1.u3("none", var7.a5(), (short)3)) {
               return;
            }

            if (!d1.n5(var7.o2())) {
               var4.u3(var7.o2());
            }

            if (!d1.n5(var7.e0())) {
               var4.k5(var7.e0());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      l6(var0, var1, var3.a6(), var2);
      n5(var0, var1, var3.a6(), var2);
      int var28 = var1.h0();
      if (var4 != null && var28 > 0) {
         byte[] var8 = var1.u9();
         w1[] var9 = var1.a6();
         com.aspose.slides.internal.w5i.k5 var10 = com.aspose.slides.internal.v6g.k5.n5(
            var0.u3().n5(y4.k5(var4.z1()), false), com.aspose.slides.internal.w5i.k5.class
         );
         com.aspose.slides.internal.w5i.k5 var11 = com.aspose.slides.internal.v6g.k5.n5(
            var0.u3().n5(y4.k5(var4.t4()), false), com.aspose.slides.internal.w5i.k5.class
         );
         com.aspose.slides.internal.w5i.k5 var12 = com.aspose.slides.internal.v6g.k5.n5(
            var0.u3().n5(y4.k5(var4.q0()), false), com.aspose.slides.internal.w5i.k5.class
         );
         if (var10 != null) {
            w1 var13 = var9[0].u3();
            double var14 = 0.0;
            if (var28 >= 2) {
               w1 var16 = var9[1].u3();
               var14 = n5(var13.u3(), var16.u3());
            }

            com.aspose.slides.internal.f5n.l6.n5(var0, var3.a6(), var4, var10, var9[0].u3(), var14);
         }

         if (var11 != null) {
            int var29 = 0;

            for (int var17 = 1; var17 < var28 - 1; var17++) {
               if ((var8[var17] & 255) == 3) {
                  if (++var29 < 3) {
                     continue;
                  }
               }

               var29 = 0;
               w1 var18 = var9[var17 - 1].u3();
               w1 var32 = var9[var17 + 1].u3();
               w1 var19 = var9[var17].u3();
               double var20 = n5(var18.u3(), var19.u3());
               double var22 = n5(var19.u3(), var32.u3());
               double var24 = (var20 + var22) / 2.0;
               com.aspose.slides.internal.f5n.l6.n5(var0, var3.a6(), var4, var11, var19.u3(), var24);
            }
         }

         if (var12 != null) {
            w1 var30 = var9[var28 - 1].u3();
            double var31 = 0.0;
            if (var1.h0() >= 2) {
               w1 var33 = var9[var28 - 2].u3();
               var31 = n5(var33.u3(), var30.u3());
            }

            com.aspose.slides.internal.f5n.l6.n5(var0, var3.a6(), var4, var12, var30.u3(), var31);
         }
      }
   }

   public static double n5(w1 var0, w1 var1) {
      float var2 = var1.l6() - var0.l6();
      float var3 = var1.k5() - var0.k5();
      return q1.u3(var3, var2) * 180.0 / Math.PI;
   }

   public static void n5(com.aspose.slides.internal.w9s.u3 var0, s7 var1, f2 var2, t2 var3) {
      a6 var4 = (a6)var3;
      float var5 = var0.a6().n5(var4.c8(), "xy", var3, var2.a6());
      if (y4.n5(var4.h0()) && !(var5 <= 0.0F)) {
         String var6 = var4.h0();
         float var7 = var4.t2();
         n3 var8 = null;
         if (d1.l6(var6, "url(#")) {
            com.aspose.slides.internal.l5.l6 var9 = n5(var0, var1, var2.a6(), var4, var7, var6, true);
            if (var9 == null) {
               var9 = n5(var6, var7);
            }

            if (var9 != null) {
               var8 = new n3(var9);
            }
         } else {
            c8 var10 = com.aspose.slides.internal.b3z.u3.n5(var6).n5().o8();
            var8 = new n3(c8.n5(com.aspose.slides.internal.v6g.k5.u3(255.0F * var7, 13), var10.o8()).o8());
         }

         n5(var0, var8, var1, var2.a6(), var4);
      }
   }

   private static void n5(com.aspose.slides.internal.w9s.u3 var0, n3 var1, s7 var2, f2 var3, a6 var4) {
      if (var1 != null) {
         float var5 = var0.a6().n5(var4.c8(), "xy", var4, var3.a6());
         if (var5 > 0.0F) {
            var1.k5(var5);
            boolean var6 = var2.s7().s7() <= 0.0F && var2.s7().k5() <= 0.0F && var2.h0() > 0;
            switch (var4.s7()) {
               case 1:
                  var1.u3(2);
                  var1.l6(2);
                  var1.n5(2);
                  if (var6) {
                     s7 var27 = new s7();

                     try {
                        w1[] var30 = var2.a6();
                        var27.n5(var30[0].l6() - var5 / 2.0F, var30[0].k5() - var5 / 2.0F, var5, var5);
                        var0.n5().n5(var1.k5(), var27);
                     } finally {
                        if (var27 != null) {
                           var27.dispose();
                        }
                     }

                     return;
                  }
                  break;
               case 2:
                  var1.u3(1);
                  var1.l6(1);
                  if (var6) {
                     s7 var7 = new s7();

                     try {
                        w1[] var8 = var2.a6();
                        var7.l6(new y1(var8[0].l6() - var5 / 2.0F, var8[0].k5() - var5 / 2.0F, var5, var5));
                        var0.n5().n5(var1.k5(), var7);
                     } finally {
                        if (var7 != null) {
                           var7.dispose();
                        }
                     }

                     return;
                  }
            }

            com.aspose.slides.internal.b3z.u9 var26 = var4.x8();
            if (!com.aspose.slides.internal.b3z.u9.n5(var26)) {
               List var28 = new List();
               boolean var9 = var1.c8() == 2;

               for (com.aspose.slides.internal.b3z.a6 var11 : var26) {
                  float var12 = var0.a6().n5(var11, "xy", var4, var3.a6()) / var5;
                  var28.addItem(!(var12 > 0.0F) && !var9 ? 0.01F : var12);
               }

               if (var28.size() % 2 != 0) {
                  var28.addRange(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var28.toArray(new Float[0])))));
               }

               if (var9) {
                  var28 = n5(var28, var1);
               } else {
                  boolean var32 = false;

                  for (int var35 = 0; var35 < var28.size(); var35++) {
                     if ((var35 + 1) % 2 != 0 && (Float)var28.get_Item(var35) > Float.MIN_VALUE) {
                        var32 = true;
                        break;
                     }
                  }

                  if (!var32) {
                     return;
                  }
               }

               if (!var28.containsItem(0.0F)) {
                  var1.n5(t4.k5(var28));
                  float var33 = var0.a6().n5(var4.n3(), "xy", var4, var3.a6());
                  var1.n5(var1.t2() + var33 / var5);
               }
            }

            switch (l6.n5(d1.u9(var4.l6.k5("stroke-linejoin", "miter")))) {
               case 0:
                  var1.k5(1);
                  break;
               case 1:
                  var1.k5(2);
                  break;
               default:
                  var1.k5(3);
                  var1.l6(com.aspose.slides.internal.b3z.c8.n5(var4.l6.k5("stroke-miterlimit", "4"), 4.0F));
            }

            m1 var29 = var0.n5().a6();

            try {
               float[] var31 = t9.n5(var29);
               float var34 = var31[0];
               float var36 = var31[1];
               if (var1.t4() <= 1.0F && (var34 > 1.0F || var36 > 1.0F)) {
                  var1.k5(var1.t4() + 0.01F);
               }

               if (var1.t4() * var34 < 1.0F
                  && var1.t4() * var36 < 1.0F
                  && com.aspose.slides.internal.v6g.k5.l6(var1.k5(), com.aspose.slides.internal.l5.y4.class)) {
                  c8 var37 = var1.u3().o8();
                  var1.n5(c8.n5(com.aspose.slides.internal.v6g.k5.u3((var37.s7() & 0xFF) * var1.t4() * var34, 13), var37.o8()).o8());
               }

               var0.n5().n5(var1, var2);
            } finally {
               var0.n5().n5(var29);
            }
         }
      }
   }

   private static List<Float> n5(List<Float> var0, n3 var1) {
      List var2 = new List();
      if (var0.size() > 3 && var0.containsItem(0.0F)) {
         float var3 = 0.0F;
         float var4 = 0.0F;

         for (int var5 = 0; var5 < var0.size(); var5++) {
            if ((var5 + 1) % 2 != 0) {
               var3 += var0.get_Item(var5);
            } else {
               var4 += var0.get_Item(var5);
               if ((Float)var0.get_Item(var5) > 0.0F) {
                  var2.addItem(var3);
                  var2.addItem(var4);
                  var3 = 0.0F;
                  var4 = 0.0F;
               } else if (var3 > 0.0F && var5 == var0.size() - 1 && (Float)var2.get_Item(0) == 0.0F) {
                  var2.set_Item(0, var3);
                  var1.n5(var3);
               }
            }
         }
      } else {
         var2.addRange(var0);
      }

      for (int var7 = 0; var7 < var2.size(); var7++) {
         if (var7 % 2 == 0) {
            var2.set_Item(var7, (Float)var2.get_Item(var7) + 1.0F);
         } else {
            float var6 = (Float)var2.get_Item(var7) - 1.0F;
            if (var6 == 0.0F) {
               var6 = Float.MIN_VALUE;
            }

            var2.set_Item(var7, var6 < 0.0F ? 0.0F : var6);
         }
      }

      return var2;
   }

   public static void l6(com.aspose.slides.internal.w9s.u3 var0, s7 var1, f2 var2, t2 var3) {
      a6 var4 = (a6)var3;
      if (var4.e2()) {
         var1.n5(com.aspose.slides.internal.a3s.l6.k5(var3.r4()));
         String var5 = var4.y4();
         float var6 = var4.t9();
         com.aspose.slides.internal.l5.l6 var7 = null;
         if (d1.l6(var5, "url(#")) {
            var7 = n5(var0, var1, var2.a6(), (a6)var3, var6, var5, false);
            if (var7 == null) {
               var7 = n5(var5, var6);
            }
         } else {
            c8 var8 = com.aspose.slides.internal.b3z.u3.n5(var5).n5().o8();
            var7 = new com.aspose.slides.internal.l5.y4(c8.n5(com.aspose.slides.internal.v6g.k5.u3(255.0F * var6, 13), var8.o8()).o8());
         }

         if (var7 != null) {
            var0.n5().n5(var7, var1);
         }
      }
   }

   private static com.aspose.slides.internal.l5.l6 n5(String var0, float var1) {
      String var2 = com.aspose.slides.internal.r7c.c8.n5(var0, "url\\(.*?\\)", "");
      if (d1.n5(d1.l6(var2))) {
         return null;
      }

      c8 var3 = com.aspose.slides.internal.b3z.u3.n5(var2).n5().o8();
      return new com.aspose.slides.internal.l5.y4(c8.n5(com.aspose.slides.internal.v6g.k5.u3(255.0F * var1, 13), var3.o8()).o8());
   }

   private static com.aspose.slides.internal.l5.l6 n5(com.aspose.slides.internal.w9s.u3 var0, s7 var1, f2 var2, a6 var3, float var4, String var5, boolean var6) {
      com.aspose.slides.internal.l5.l6 var7 = null;
      String var8 = y4.k5(var5);
      t2 var9 = var0.u3().n5(var8);
      y1 var10 = var1.s7().y4();
      if (com.aspose.slides.internal.v6g.k5.l6(var9, com.aspose.slides.internal.w5i.l6.class)) {
         com.aspose.slides.internal.w5i.l6 var11 = (com.aspose.slides.internal.w5i.l6)var9;
         var7 = var11.n5(var3, var0.u3(), var0.a6(), var10.y4(), new y1(new w1(0.0F, 0.0F), var2.a6()), var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var9, com.aspose.slides.internal.w5i.a6.class)) {
         s7 var26 = null;
         com.aspose.slides.internal.w5i.a6 var12 = (com.aspose.slides.internal.w5i.a6)var9;
         s7[] var13 = new s7[]{var26};
         var7 = var12.n5(var3, var0.u3(), var0.a6(), var10.y4(), new y1(new w1(0.0F, 0.0F), var2.a6()), var4, var13);
         var26 = var13[0];
         if (var7 != null && var12.d5() == 0) {
            a0 var14 = var0.n5().l6();

            try {
               c8 var15 = ((x8)var7).h0().n5()[0].o8();
               com.aspose.slides.internal.l5.y4 var16 = new com.aspose.slides.internal.l5.y4(var15.o8());

               try {
                  a0 var17 = var14.l6();
                  var17.n5(var26);
                  var0.n5().l6(var17);
                  if (var6) {
                     n5(var0, new n3(var16), var1, var2.a6(), var3);
                  } else {
                     var0.n5().n5(var16, var1);
                  }
               } finally {
                  if (var16 != null) {
                     var16.dispose();
                  }
               }
            } finally {
               var0.n5().l6(var14);
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var9, com.aspose.slides.internal.w5i.u3.class)) {
         com.aspose.slides.internal.w5i.u3 var28 = (com.aspose.slides.internal.w5i.u3)var9;
         var7 = u3.n5(var28, var0, var3, var10.y4(), new y1(new w1(0.0F, 0.0F), var2.a6()), var4);
      }

      return var7;
   }

   public static a0 n5(com.aspose.slides.internal.w9s.u3 var0, com.aspose.slides.internal.d0e.n5 var1, f2 var2, t2 var3) {
      a0 var4 = k5(var0, var1, var2.a6(), var3);
      a0 var5 = u3(var0, var1, var2.a6(), var3);
      if (var5 != null) {
         if (var4 != null) {
            var4.k5(var5);
         } else {
            var4 = var5;
         }
      }

      a0 var6 = l6(var0, var1, var2.a6(), var3);
      if (var6 != null) {
         if (var4 != null) {
            var4.k5(var6);
         } else {
            var4 = var6;
         }
      }

      return var4;
   }

   public static com.aspose.slides.internal.u3t.l6 n5(com.aspose.slides.internal.w9s.u3 var0, t2 var1) {
      String var2 = var1.l6.k5("mask");
      return !d1.n5(var2) && d1.l6(var2, "url(#") ? com.aspose.slides.internal.v6g.k5.n5(var0.u3().n5(var2), com.aspose.slides.internal.u3t.l6.class) : null;
   }

   public static com.aspose.slides.internal.k7d.u9 l6(com.aspose.slides.internal.w9s.u3 var0, t2 var1) {
      String var2 = var1.l6.k5("filter");
      return !d1.n5(var2) && d1.l6(var2, "url(#") ? com.aspose.slides.internal.v6g.k5.n5(var0.u3().n5(var2), com.aspose.slides.internal.k7d.u9.class) : null;
   }

   private static a0 l6(com.aspose.slides.internal.w9s.u3 var0, com.aspose.slides.internal.d0e.n5 var1, f2 var2, t2 var3) {
      com.aspose.slides.internal.u3t.l6 var4 = n5(var0, var3);
      if (var4 == null) {
         return null;
      }

      a0 var5 = new a0();
      var5.u3();
      y1 var6 = y1.n5.y4();
      f2 var7 = f2.n5.a6();
      if (var4.a0() == 1 || var4.d2() == 1) {
         var1.n5(var0.a6(), var2.a6()).a6(var6);
         var6.c8().l6(var7);
      }

      f2 var8 = (var4.a0() == 0 ? var2 : var7).a6();
      y1 var9 = var4.n5(var0.a6(), var8.a6()).y4();
      if (y1.k5(var9, y1.n5)) {
         return null;
      }

      if (var4.a0() == 1) {
         var9.k5(var6.x8(), var6.n3());
      }

      return new a0(var9.y4());
   }

   private static a0 k5(com.aspose.slides.internal.w9s.u3 var0, com.aspose.slides.internal.d0e.n5 var1, f2 var2, t2 var3) {
      String var4 = var3.l6.k5("clip-path");
      if (!d1.n5(var4) && d1.l6(var4, "url(#")) {
         com.aspose.slides.internal.u3t.n5 var5 = com.aspose.slides.internal.v6g.k5.n5(var0.u3().n5(var4), com.aspose.slides.internal.u3t.n5.class);
         if (var5 == null) {
            return null;
         }

         f2 var6 = var2.a6();
         y1 var7 = y1.n5.y4();
         if (var5.d2()) {
            var1.n5(var0.a6(), var2.a6()).a6(var7);
            var7.c8().l6(var6);
         }

         a0 var8 = new a0();
         var8.u3();
         int var9 = var0.a6().n5;

         try {
            a0 var10 = n5(var0, var1, var2.a6(), var5);
            var0.a6().n5 = var5.d2() ? 1 : 0;
            var0.n5(var5, var6.a6(), var8);
            if (var5.y2()) {
               m1 var11 = var0.h0().n5(var5.c4(), var6.a6());
               var8.l6(var11);
            }

            if (var5.d2()) {
               m1 var15 = new m1();
               var15.k5(var7.x8(), var7.n3());
               var8.l6(var15);
            }

            if (var10 != null) {
               var8.k5(var10);
            }
         } finally {
            var0.a6().n5 = var9;
         }

         return var8;
      } else {
         return null;
      }
   }

   private static a0 u3(com.aspose.slides.internal.w9s.u3 var0, com.aspose.slides.internal.d0e.n5 var1, f2 var2, t2 var3) {
      String var4 = var3.l6.k5("clip");
      if (!d1.n5(var4) && d1.l6(var4, "rect(")) {
         int var5 = d1.u3(var4, '(');
         int var6 = d1.u3(var4, ')');
         var4 = d1.l6(var4, var5 + 1, var6 - var5 - 1);
         String[] var7 = d1.n5(var4, new String[]{" ", ","}, 1);
         List var8 = new List();

         for (String var12 : var7) {
            var8.addItem(com.aspose.slides.internal.b3z.c8.n5(var12));
         }

         if (var8.size() == 4) {
            y1 var14 = var1.n5(var0.a6(), var2.a6()).y4();
            y1 var15 = new y1(
               var14.a6() + (Float)var8.get_Item(3),
               var14.t2() + (Float)var8.get_Item(0),
               var14.s7() - ((Float)var8.get_Item(3) + (Float)var8.get_Item(1)),
               var14.k5() - ((Float)var8.get_Item(2) + (Float)var8.get_Item(0))
            );
            return new a0(var15.y4());
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
