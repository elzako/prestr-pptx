package com.aspose.slides.internal.n1n;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.d0e.s7;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.d0e.u9;
import com.aspose.slides.internal.r7c.c8;
import com.aspose.slides.internal.z0k.w1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.p5;
import java.util.regex.Matcher;

public class l6 {
   public static final c8 n5 = new c8(
      "\\s*(normal|italic|oblique)?\\s*(normal|small\\-caps)?\\s*(normal|bold|100|200|300|400|500|600|700|800|900)?\\s*(\\d+(px|%|pt|em|mm|in|cm)?)?\\s*(/+normal|\\d+(px|%|pt|em|mm|in|cm)?)?\\s*(([^,]*(\\s|,)*)*);?",
      74
   );

   public static void n5(Dictionary<String, String> var0, String var1) {
      String var2 = d1.n5;
      String var3 = d1.n5;
      String[] var4 = d1.n5(var1, new String[]{";", "\r", "\n", "\t"}, 1);

      for (String var8 : var4) {
         String[] var9 = d1.n5(var8, new String[]{":"}, 1);
         if (var9.length >= 2) {
            if ("font".equals(d1.u9(var9[0]))) {
               Matcher var10 = c8.n5(n5).matcher(var9[1]);
               if (var10.find()) {
                  String var11 = var10.group(1);
                  if (var11 != null && ("italic".equals(var11) || "oblique".equals(var11))) {
                     if (var0.containsKey("font-style")) {
                        var0.removeItemByKey(var2);
                     }

                     var0.addItem("font-style", var11);
                  }

                  String var12 = var10.group(3);
                  if (var12 != null) {
                     if (var0.containsKey("font-weight")) {
                        var0.removeItemByKey(var2);
                     }

                     var0.addItem("font-weight", var12);
                  }

                  String var13 = var10.group(4);
                  if (var13 != null) {
                     if (var0.containsKey("font-size")) {
                        var0.removeItemByKey(var2);
                     }

                     var0.addItem("font-size", var13);
                  }

                  String var14 = var10.group(8);
                  if (var14 != null) {
                     if (var0.containsKey("font-family")) {
                        var0.removeItemByKey(var2);
                     }

                     var0.addItem("font-family", var14);
                  }
               }
            } else {
               var2 = d1.l6(var9[0]);
               var3 = d1.l6(var9[1]);
               if (var0.containsKey(var2)) {
                  var0.removeItemByKey(var2);
               }

               var0.addItem(var2, var3);
            }
         }
      }
   }

   public static s7 n5(String var0) {
      s7 var1 = new s7();
      var0 = d1.n5(var0, "xlink:href", "xlinkhref");

      try {
         t2 var2 = new t2("root", new com.aspose.slides.internal.d0e.k5(), null);
         var1.u9 = var2;
         var0 = d1.l6(d1.l6(var0, d1.c8(var0, "<svg"), var0.length() - d1.c8(var0, "<svg")));
         p5 var3 = new p5(new w1(var0));
         Stack var4 = new Stack();
         var4.push(var2);

         while (var3.u9()) {
            Dictionary var5 = new Dictionary();
            if (var3.y2()) {
               String var6 = d1.n5;

               while (var3.u3()) {
                  if ("xlinkhref".equals(var3.x8())) {
                     var5.addItem("xlink:href", var3.z1());
                  } else if ("style".equals(var3.x8())) {
                     var6 = var3.u3("style");
                  } else {
                     var5.addItem(var3.x8(), var3.z1());
                  }
               }

               if (!d1.n5(var6)) {
                  n5(var5, var6);
               }

               var3.a6();
            }

            if (var3.s7() == 3 || var3.s7() == 4 || var3.s7() == 13) {
               com.aspose.slides.internal.j7h.n5 var10 = new com.aspose.slides.internal.j7h.n5();
               var10.l6 = new com.aspose.slides.internal.d0e.k5(var5);
               var10.n5 = (t2)var4.peek();
               var10.c8 = var3.z1();
               if (var3.x8() != null && !d1.a6(var3.x8(), "svg") && var4.peek() != null) {
                  ((t2)var4.peek()).j5().n5(((t2)var4.peek()).j5().n5(), var10);
               }
            }

            if (var3.s7() == 1) {
               t2 var11 = u9.n5(var3.n3());
               var11.l6 = new com.aspose.slides.internal.d0e.k5(var5);
               var11.n5 = (t2)var4.peek();
               ((t2)var4.peek()).j5().n5(((t2)var4.peek()).j5().n5(), var11);
               if (!var3.m1()) {
                  var4.push(var11);
               }
            } else if (var3.s7() == 15 && d1.a6(var3.n3(), ((t2)var4.peek()).u9)) {
               var4.pop();
            }
         }

         return var1;
      } catch (RuntimeException var7) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var7;
         } else {
            return var1;
         }
      }
   }
}
