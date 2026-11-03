package com.aspose.slides.internal.b5j;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h0.z8;
import com.aspose.slides.internal.k5.t1;
import com.aspose.slides.internal.k5.u6;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class y4 {
   public static boolean n5(String var0) {
      return var0 != null && !d1.n5(d1.l6(var0)) && !d1.u3("none", d1.l6(var0), (short)3);
   }

   public static String l6(String var0) {
      String var1 = var0;
      var1 = d1.n5(var1, " ", d1.n5);
      var1 = d1.n5(var1, "\r", d1.n5);
      var1 = d1.n5(var1, "\n", d1.n5);
      return d1.n5(var1, "\t", d1.n5);
   }

   public static void n5(com.aspose.slides.internal.d0e.t2 var0, h0 var1, boolean var2) {
      if ("style".equals(var0.u9)) {
         a5 var3 = new a5();
         IGenericEnumerator var4 = var0.j5().iterator();

         try {
            while (var4.hasNext()) {
               KeyValuePair var5 = (KeyValuePair)var4.next();
               var3.n5(((com.aspose.slides.internal.j7h.n5)var5.getValue()).c8);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         var1.n5(var3.toString());
      }

      IGenericEnumerator var14 = var0.j5().iterator();

      try {
         while (var14.hasNext()) {
            KeyValuePair var15 = (KeyValuePair)var14.next();
            n5((com.aspose.slides.internal.d0e.t2)var15.getValue(), var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }
   }

   public static void n5(com.aspose.slides.internal.d0e.t2 var0, x8 var1, u3 var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.f7k.l6.class)) {
         n5((com.aspose.slides.internal.f7k.l6)var0, var1, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.f7k.n5.class)) {
         var1.n5((com.aspose.slides.internal.f7k.n5)var0);
      } else {
         IGenericEnumerator var3 = var0.j5().iterator();

         try {
            while (var3.hasNext()) {
               KeyValuePair var4 = (KeyValuePair)var3.next();
               com.aspose.slides.internal.d0e.t2 var5 = (com.aspose.slides.internal.d0e.t2)var4.getValue();
               n5(var5, var1, var2);
               if (!d1.n5(var5.k7()) && !var1.l6().containsKey(var5.k7())) {
                  var1.l6().addItem(var5.k7(), var5);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   public static void n5(com.aspose.slides.internal.d0e.t2 var0, x8 var1) {
      for (int var2 = 0; var2 < var0.j5().n5(); var2++) {
         com.aspose.slides.internal.d0e.t2 var3 = var0.j5().l6(var2);
         n5(var3, var1);
         com.aspose.slides.internal.d8v.h0 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.d8v.h0.class);
         if (var4 != null) {
            var0.j5().k5(var2, var4.n5(var1));
         }
      }
   }

   public static void n5(com.aspose.slides.internal.d0e.t2 var0, boolean var1, Dictionary<String, IGenericDictionary<String, String>> var2) {
      if (!"defs".equals(var0.u9)) {
         String var3 = ",x,y,width,height,fill,fill-rule,fill-opacity,stroke,stroke-width,stroke-opacity,font-size,font-family,font-weight,font-variant,opacity,cap-height,rotate,text-anchor,x,y,glyph-orientation-horizontal,glyph-orientation-vertical,bounding-box-width,bounding-box-height,view-clip-id,clip-path,color,visibility,display,transform,";
         String var4 = d1.n5;
         String var5 = d1.n5;
         List var6 = new List<>(com.aspose.slides.ms.System.u3.n5(new String[]{"svg", "g", "use"}));
         if (var0.l6.n5("xlink:href")) {
            String var7 = var0.l6.k5("xlink:href").toString();
            if (var6.containsItem(var0.u9) && d1.l6(var7, "#")) {
               var7 = d1.n5(var7, 0, 1);
               var2.set_Item(var7, var0.l6);
            }
         }

         if (var0.l6.n5("id")) {
            String var36 = var0.l6.k5("id").toString();
            if (var2.containsKey(var36)) {
               IGenericDictionary var8 = (IGenericDictionary)var2.get_Item(var36);
               IGenericEnumerator var9 = var8.iterator();

               try {
                  while (var9.hasNext()) {
                     KeyValuePair var10 = (KeyValuePair)var9.next();
                     if (!var0.l6.n5((String)var10.getKey())) {
                        var0.l6.l6((String)var10.getKey(), (String)var10.getValue());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     var9.dispose();
                  }
               }
            }
         }

         if (var0.l6.n5("width") && var6.containsItem(var0.u9)) {
            var0.l6.l6("bounding-box-width", var0.l6.k5("width").toString());
         }

         if (var0.l6.n5("height") && var6.containsItem(var0.u9)) {
            var0.l6.l6("bounding-box-height", var0.l6.k5("height").toString());
         }

         if (var0.l6.n5("color") && d1.a6("inherit", var0.l6.k5("color"))) {
            var0.l6.l6("color", var0.z8().l6.n5("color") ? var0.z8().l6.k5("color") : "black");
         }

         if ("text".equals(var0.u9) && !var0.l6.n5("fill") && !var0.l6.n5("stroke")) {
            var0.l6.n5("fill", "#000000");
         }

         String[] var37 = new String[]{"fill", "stroke", "stop-color", "flood-color", "lighting-color"};

         for (String var11 : var37) {
            if (var0.l6.n5(var11) && "currentColor".equals(var0.l6.k5(var11))) {
               var0.l6.l6(var11, var0.l6.n5("color") ? var0.l6.k5("color") : "black");
            }
         }

         IGenericEnumerator var39 = var0.l6.iterator();

         try {
            while (var39.hasNext()) {
               KeyValuePair var41 = (KeyValuePair)var39.next();
               var4 = ((String)var41.getKey()).toString();
               var5 = ((String)var41.getValue()).toString();
               if (!"style".equals(((String)var41.getKey()).toString()) && !"class".equals(((String)var41.getKey()).toString())) {
                  if (t4.n5(var3, d1.n5(new String[]{",", ((String)var41.getKey()).toString(), ","}), true)) {
                     n5(var0, var4, var5, var1);
                  }
               } else {
                  String var44 = d1.n5;
                  if ("style".equals(((String)var41.getKey()).toString())) {
                     var44 = ((String)var41.getValue()).toString();
                  } else if ("class".equals(((String)var41.getKey()).toString())) {
                     var44 = new h0().l6(((String)var41.getValue()).toString());
                  }

                  String[] var46 = d1.n5(var44, new String[]{";"}, 1);

                  for (String var15 : var46) {
                     String[] var16 = d1.n5(var15, new String[]{":"}, 1);
                     if (var16.length >= 2) {
                        var4 = d1.l6(var16[0]);
                        var5 = d1.l6(var16[1]);
                        if (t4.n5(var3, d1.n5(new String[]{",", var4, ","}), true)) {
                           n5(var0, var4, var5, var1);
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var39, IDisposable.class)) {
               var39.dispose();
            }
         }

         IGenericEnumerator var42 = var0.j5().iterator();

         try {
            while (var42.hasNext()) {
               KeyValuePair var45 = (KeyValuePair)var42.next();
               n5((com.aspose.slides.internal.d0e.t2)var45.getValue(), var1, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
               var42.dispose();
            }
         }
      }
   }

   public static void n5(com.aspose.slides.internal.d0e.t2 var0, String var1, String var2, boolean var3) {
      IGenericEnumerator var4 = var0.j5().iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            com.aspose.slides.internal.d0e.t2 var6 = (com.aspose.slides.internal.d0e.t2)var5.getValue();
            if ("transform".equals(var1)) {
               if (var6.l6.n5("transform")) {
                  String var7 = var6.l6.k5("transform").toString();
                  var6.l6.l6(var1, d1.n5(new String[]{var2, " ", var7}));
               } else {
                  var6.l6.l6(var1, var2);
               }
            } else if (!"x".equals(var1) && !"y".equals(var1)) {
               if (!"clip-path".equals(var1) && (!((com.aspose.slides.internal.d0e.t2)var5.getValue()).l6.n5(var1) || var3)) {
                  if (var3 && ((com.aspose.slides.internal.d0e.t2)var5.getValue()).l6.n5(var1)) {
                     ((com.aspose.slides.internal.d0e.t2)var5.getValue()).l6.l6(var1);
                  }

                  ((com.aspose.slides.internal.d0e.t2)var5.getValue()).l6.n5(var1, var2);
               }
            } else if (("g".equals(var0.u9) || "svg".equals(var0.u9) || "symbol".equals(var0.u9) || "image".equals(var0.u9))
               && !((com.aspose.slides.internal.d0e.t2)var5.getValue()).l6.n5(var1)) {
               ((com.aspose.slides.internal.d0e.t2)var5.getValue()).l6.n5(var1, var2);
            }

            if ("bounding-box-width".equals(var1)) {
               ((com.aspose.slides.internal.d0e.t2)var5.getValue()).l6.l6("bounding-box-width", var2);
            }

            if ("bounding-box-height".equals(var1)) {
               ((com.aspose.slides.internal.d0e.t2)var5.getValue()).l6.l6("bounding-box-height", var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   public static void n5(com.aspose.slides.internal.d0e.t2 var0, u3 var1, u9 var2) {
      if ("style".equals(var0.u9)) {
         a5 var15 = new a5();
         IGenericEnumerator var17 = var0.j5().iterator();

         try {
            while (var17.hasNext()) {
               KeyValuePair var19 = (KeyValuePair)var17.next();
               var15.n5(((com.aspose.slides.internal.j7h.n5)var19.getValue()).c8);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
               var17.dispose();
            }
         }

         com.aspose.slides.internal.h0.c8 var20 = new com.aspose.slides.internal.h0.c8();
         z8 var21 = var20.n5(null, new com.aspose.slides.internal.h0.u3(var1));
         var2.n5(var21.n5(var15.toString()));
      } else if ("link".equals(var0.u9)) {
         if (var0.l6.n5("type") && "text/css".equals(var0.l6.k5("type")) && var0.l6.n5("rel") && "stylesheet".equals(var0.l6.k5("rel")) && var0.l6.n5("href")) {
            t1 var14 = var1.n5(var0, new u6(var0.l6.k5("href")));
            String var16 = j5.e2().l6(var14.n5());
            com.aspose.slides.internal.h0.c8 var18 = new com.aspose.slides.internal.h0.c8();
            z8 var6 = var18.n5(null, new com.aspose.slides.internal.h0.u3(var1));
            var2.n5(var6.n5(var16));
         }
      } else {
         IGenericEnumerator var3 = var0.j5().iterator();

         try {
            while (var3.hasNext()) {
               KeyValuePair var4 = (KeyValuePair)var3.next();
               com.aspose.slides.internal.d0e.t2 var5 = (com.aspose.slides.internal.d0e.t2)var4.getValue();
               if (var5 != null) {
                  n5(var5, var1, var2);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   public static void n5(com.aspose.slides.internal.d0e.t2 var0, n3 var1, f2[] var2, com.aspose.slides.internal.b3z.s7 var3) {
      if (var0.l6.n5("width") && var1.n5(var0.l6.k5("width"), "width", var0) > var2[0].l6()) {
         var2[0].n5(var1.n5(var0.l6.k5("width"), "width", var0));
      } else if (var2[0].l6() <= 0.0F) {
         if (com.aspose.slides.internal.d0e.s7.l6 == -1.0F) {
            var2[0].n5(var3 != null ? var3.n5(var1).s7() : 500.0F);
         } else {
            var2[0].n5(com.aspose.slides.internal.d0e.s7.l6);
         }
      }

      if (var0.l6.n5("height") && var1.n5(var0.l6.k5("height"), "height", var0) > var2[0].k5()) {
         var2[0].l6(var1.n5(var0.l6.k5("height"), "height", var0));
      } else if (var2[0].k5() <= 0.0F) {
         if (com.aspose.slides.internal.d0e.s7.n5 == -1.0F) {
            var2[0].l6(var3 != null ? var3.n5(var1).k5() : 500.0F);
         } else {
            var2[0].l6(com.aspose.slides.internal.d0e.s7.n5);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.f7k.l6 var0, x8 var1, u3 var2) {
      IGenericEnumerator var3 = var0.j5().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            com.aspose.slides.internal.d0e.t2 var5 = (com.aspose.slides.internal.d0e.t2)var4.getValue();
            if ("font-face-src".equals(var5.u9)) {
               IGenericEnumerator var6 = var5.j5().iterator();

               try {
                  while (var6.hasNext()) {
                     KeyValuePair var7 = (KeyValuePair)var6.next();
                     com.aspose.slides.internal.d0e.t2 var8 = (com.aspose.slides.internal.d0e.t2)var7.getValue();
                     if ("font-face-uri".equals(var8.u9) && var8.l6.n5("xlink:href")) {
                        String var9 = var8.l6.k5("xlink:href");
                        String[] var10 = d1.n5(var9, '#');
                        if (var2 != null) {
                           t1 var11 = var2.n5(var8, new u6(var10[0]));
                           if (var11 != null) {
                              com.aspose.slides.internal.d0e.s7 var12 = com.aspose.slides.internal.n1n.l6.n5(var11.l6().l6(var11.n5()));
                              com.aspose.slides.internal.f7k.n5 var13 = n5(var12.u9, var10[1]);
                              if (var13 != null) {
                                 var1.n5(var13);
                              }
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.f7k.n5 n5(com.aspose.slides.internal.d0e.t2 var0, String var1) {
      if ("font".equals(var0.u9) && d1.a6(var0.l6.k5("id"), var1)) {
         return (com.aspose.slides.internal.f7k.n5)var0;
      }

      if (var0.m1()) {
         IGenericEnumerator var2 = var0.j5().iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               com.aspose.slides.internal.f7k.n5 var4 = n5((com.aspose.slides.internal.d0e.t2)var3.getValue(), var1);
               if (var4 != null) {
                  return var4;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      return null;
   }

   public static boolean n5(com.aspose.slides.internal.d0e.t2 var0) {
      if ("style".equals(var0.u9) || "defs".equals(var0.u9)) {
         return false;
      } else if ("tref".equals(var0.u9) || "altGlyph".equals(var0.u9)) {
         return false;
      } else if ("pattern".equals(var0.u9) || "symbol".equals(var0.u9) || "marker".equals(var0.u9)) {
         return false;
      } else {
         return "clipPath".equals(var0.u9) || "mask".equals(var0.u9)
            ? false
            : !"filter".equals(var0.u9) && !"feFlood".equals(var0.u9) && !"feBlend".equals(var0.u9);
      }
   }

   public static boolean l6(com.aspose.slides.internal.d0e.t2 var0) {
      if (!var0.l6.n5("style")) {
         return true;
      }

      String var1 = var0.l6.k5("style").toString();
      String[] var2 = d1.n5(var1, new String[]{";"}, 1);

      for (String var6 : var2) {
         String[] var7 = d1.n5(var6, new String[]{":"}, 1);
         String var8 = d1.l6(var7[0]);
         String var9 = d1.n5;
         if (var7.length > 1) {
            var9 = d1.l6(var7[1]);
         }

         if ("media".equals(var8) && !d1.t2(var9, "all") && !d1.t2(var9, "print") && !d1.t2(var9, "screen")) {
            return false;
         }
      }

      return true;
   }

   public static String k5(String var0) {
      String var1 = d1.n5;
      var1 = d1.n5(var0, "url(", d1.n5);
      if (var1.charAt(0) == '#') {
         var1 = d1.n5(var1, 0, 1);
      }

      int var2 = d1.u3(var1, ')');
      if (var2 > 0) {
         var1 = d1.l6(var1, 0, var2);
      }

      return var1;
   }

   public static y1 n5(com.aspose.slides.internal.b3z.k5 var0, y1 var1, y1 var2) {
      float var3 = var2.x8();
      float var4 = var2.n3();
      float var5 = 1.0F;
      float var6 = 1.0F;
      int var7 = var0.l6();
      if (!var1.u3()) {
         var5 = var2.s7() / var1.s7();
         var6 = var2.k5() / var1.k5();
         if (var7 != 0) {
            var5 = !var0.k5() ? q1.l6(var5, var6) : q1.n5(var5, var6);
            var6 = var5;
            if (var7 == 8 || var7 == 5 || var7 == 2) {
               var3 = var2.x8() + var2.s7() / 2.0F - var5 * (var1.x8() + var1.s7() / 2.0F);
            } else if (var7 == 9 || var7 == 6 || var7 == 3) {
               var3 = var2.s7() - var1.s7() * var5;
            }

            if (var7 == 6 || var7 == 5 || var7 == 4) {
               var4 = var2.n3() + var2.k5() / 2.0F - var6 * (var1.n3() + var1.k5() / 2.0F);
            } else if (var7 == 9 || var7 == 8 || var7 == 7) {
               var4 = var2.k5() - var1.k5() * var6;
            }
         }
      }

      return new y1(var1.x8() + var3, var1.n3() + var4, var1.s7() * var5, var1.k5() * var6);
   }
}
