package com.aspose.slides.internal.h0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class y2 {
   private final h0 n5;
   private static final com.aspose.slides.internal.r7c.c8 l6 = new com.aspose.slides.internal.r7c.c8("([0-9A-Fa-f]{6})|([0-9A-Fa-f]{3})\\s*", 0);
   private int k5;
   private int u3;
   private final List<String> a6 = new List<>(5);
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "A", "FONT", "BASEFONT", "IMG", "TABLE", "TD", "TH", "TR", "P", "DIV", "H1", "rows", "cols", "none", "all"
   );

   public y2(h0 var1) {
      this.a6.addItem("all");
      this.a6.addItem("none");
      this.a6.addItem("cols");
      this.a6.addItem("rows");
      this.a6.addItem("groups");
      this.n5 = var1;
   }

   public final m1 n5(com.aspose.slides.internal.j3.z3 var1) {
      m1 var2 = new m1(this.n5);
      switch (u9.n5(var1.a6())) {
         case 0:
            this.l6(var1, var2);
            break;
         case 1:
         case 2:
            this.k5(var1, var2);
            break;
         case 3:
            this.c8(var1, var2);
            break;
         case 4:
            this.u3(var1, var2);
            break;
         case 5:
         case 6:
            if (var1.m1() != null && var1.z3() == null) {
               this.u3 = 0;
            } else if (var1.m1() == null && var1.z3() == null) {
               this.u3 = 3;
            } else if (var1.m1() == null && var1.z3() != null) {
               this.u3 = 1;
            } else {
               this.u3 = 2;
            }

            this.a6(var1, var2);
            break;
         case 7:
            if (var1.m1() != null && var1.z3() == null) {
               this.k5 = 0;
            } else if (var1.m1() == null && var1.z3() == null) {
               this.k5 = 3;
            } else if (var1.m1() == null && var1.z3() != null) {
               this.k5 = 1;
            } else {
               this.k5 = 2;
            }

            this.u9(var1, var2);
            break;
         case 8:
         case 9:
         case 10:
            this.h0(var1, var2);
            break;
         default:
            this.n5(var1, var2);
      }

      return var2;
   }

   private void n5(com.aspose.slides.internal.j3.z3 var1, m1 var2) {
      if (var1.t2("dir")) {
         String var3 = var1.u3("dir");
         if (!d1.n5(var3)) {
            var2.n5("direction", var3, null);
         }
      }
   }

   private void l6(com.aspose.slides.internal.j3.z3 var1, m1 var2) {
      if (var1.t2("href")) {
         var2.n5("color", "blue", null);
         var2.n5("text-decoration", "underline", null);
      }
   }

   private void k5(com.aspose.slides.internal.j3.z3 var1, m1 var2) {
      if (var1.t2("color")) {
         String var3 = var1.u3("color");
         if (!d1.n5(var3)) {
            com.aspose.slides.internal.r7c.u3 var4 = l6.l6(var3);
            if (var4.u3()) {
               var3 = d1.n5(new String[]{"#", var4.k5()});
            }

            var2.n5("color", var3, null);
         }
      }

      if (var1.t2("size")) {
         String var8 = var1.u3("size");
         if (!d1.n5(var8)) {
            try {
               com.aspose.slides.internal.z8.h0 var10 = new com.aspose.slides.internal.z8.h0();
               com.aspose.slides.internal.k5.u3 var5 = (com.aspose.slides.internal.k5.u3)var10.n5(var8);
               boolean var6 = var8.charAt(0) == '-' || var8.charAt(0) == '+';
               if (var6) {
                  var8 = n5(3 + com.aspose.slides.internal.v6g.k5.u3(var5.n5((short)1), 13));
               } else {
                  var8 = n5(com.aspose.slides.internal.v6g.k5.u3(var5.n5((short)1), 13));
               }
            } catch (com.aspose.slides.internal.z8.u3 var7) {
            }

            var2.n5("font-size", var8, null);
         }
      }

      if (var1.t2("face")) {
         String var9 = var1.u3("face");
         if (!d1.n5(var9)) {
            var2.n5("font-family", var9, null);
         }
      }
   }

   private void u3(com.aspose.slides.internal.j3.z3 var1, m1 var2) {
      if (var1.t2("width")) {
         String var3 = var1.u3("width");
         if (!d1.n5(var3)) {
            var2.n5("width", var3, null);
         }
      }

      if (var1.t2("border")) {
         String var7 = var1.u3("border");
         if (!d1.n5(var7)) {
            int var4 = 0;
            int[] var5 = new int[]{0};
            boolean var6 = !a3.n5(var7, var5);
            var4 = var5[0];
            if (var6) {
               var4 = 1;
            }

            var7 = d1.n5(new String[]{a3.l6(var4), "px"});
            var2.n5("border-width", var7, null);
            var2.n5("border-style", "outset", null);
         }
      }

      if (var1.t2("rules")) {
         String var9 = var1.u3("rules");
         if (!d1.n5(var9) && this.a6.containsItem(var9)) {
            var2.n5("border-collapse", "collapse", null);
         }
      }

      if (var1.t2("bgcolor")) {
         String var10 = var1.u3("bgcolor");
         if (!d1.n5(var10)) {
            com.aspose.slides.internal.r7c.u3 var18 = l6.l6(var10);
            if (var18.u3()) {
               var10 = d1.n5(new String[]{"#", var18.k5()});
            }

            var2.n5("background-color", var10, null);
         }
      }

      if (var1.t2("bordercolor")) {
         String var11 = var1.u3("bordercolor");
         if (!d1.n5(var11)) {
            com.aspose.slides.internal.r7c.u3 var19 = l6.l6(var11);
            if (var19.u3()) {
               var11 = d1.n5(new String[]{"#", var19.k5()});
            }

            var2.n5("border-color", var11, null);
            var2.n5("border-style", "solid", null);
         }
      }

      if (var1.t2("align")) {
         String var12 = var1.u3("align");
         if (!d1.n5(var12)) {
            var12 = d1.u9(var12);
            if ("center".equals(var12)) {
               var2.n5("margin", "0px auto", null);
            }
         }
      }

      if (var1.t2("cellspacing")) {
         String var14 = var1.u3("cellspacing");
         if (!d1.n5(var14)) {
            var2.n5("border-spacing", var14, null);
         }
      }

      if (var1.a5() != null && var1.a5().n3() == 1) {
         com.aspose.slides.internal.j3.z3 var15 = (com.aspose.slides.internal.j3.z3)var1.a5();
         if (("DIV".equals(var15.a6()) || "TD".equals(var15.a6())) && var15.t2("align")) {
            String var20 = var15.u3("align");
            if (!d1.n5(var20) && "center".equals(d1.u9(var20))) {
               var2.n5("margin-left", "auto", null);
               var2.n5("margin-right", "auto", null);
            }
         }
      }

      if (var1.t2("dir")) {
         String var16 = var1.u3("dir");
         if (!d1.n5(var16) && ("rtl".equals(var16) || "ltr".equals(var16))) {
            var2.n5("direction", var16, null);
         }
      }
   }

   private void a6(com.aspose.slides.internal.j3.z3 var1, m1 var2) {
      com.aspose.slides.internal.j3.z3 var3 = n5(var1, "TABLE", 3);
      if (var3 != null) {
         if (var3.t2("border")) {
            String var4 = var3.u3("border");
            if (!d1.n5(var4)) {
               int var5 = 0;
               int[] var6 = new int[]{0};
               boolean var7 = !a3.n5(var4, var6);
               var5 = var6[0];
               if (var7) {
                  var5 = 1;
               }

               if (var5 == 0) {
                  var2.n5("border-width", "0", null);
                  var2.n5("border-style", "none", null);
               } else {
                  var2.n5("border-width", "1px", null);
                  var2.n5("border-style", "inset", null);
               }
            }
         } else {
            com.aspose.slides.internal.k5.k7 var9 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.k5.k7.class);
            if (var9 != null) {
               this.n5(var9.k5(), "border-left-style", "border-left-color", "border-left-width", var2);
               this.n5(var9.k5(), "border-top-style", "border-top-color", "border-top-width", var2);
               this.n5(var9.k5(), "border-right-style", "border-right-color", "border-right-width", var2);
               this.n5(var9.k5(), "border-bottom-style", "border-bottom-color", "border-bottom-width", var2);
            }
         }

         if (var3.t2("rules")) {
            String var10 = var3.u3("rules");
            String var19 = "0";
            String var22 = "0";
            String var23 = "none";
            String var8 = "none";
            if (!d1.n5(var10)) {
               switch (u9.n5(var10)) {
                  case 11:
                     var19 = "1";
                     var23 = "inset";
                     var22 = "0";
                     var8 = "none";
                     break;
                  case 12:
                     var22 = "1";
                     var8 = "inset";
                     var19 = "0";
                     var23 = "none";
                     break;
                  case 13:
                     var22 = "0";
                     var19 = "0";
                     var8 = "none";
                     var23 = "none";
                     break;
                  case 14:
                     var22 = "1";
                     var19 = "1";
                     var8 = "inset";
                     var23 = "inset";
               }

               switch (this.u3) {
                  case 0:
                     var2.n5("border-right-width", var22, null);
                     var2.n5("border-right-style", var8, null);
                     break;
                  case 1:
                     var2.n5("border-left-width", var22, null);
                     var2.n5("border-left-style", var8, null);
                     break;
                  case 2:
                     var2.n5("border-left-width", var22, null);
                     var2.n5("border-left-style", var8, null);
                     var2.n5("border-right-width", var22, null);
                     var2.n5("border-right-style", var8, null);
               }

               switch (this.k5) {
                  case 0:
                     var2.n5("border-bottom-width", var19, null);
                     var2.n5("border-bottom-style", var23, null);
                     break;
                  case 1:
                     var2.n5("border-top-width", var19, null);
                     var2.n5("border-top-style", var23, null);
                     break;
                  case 2:
                     var2.n5("border-bottom-width", var19, null);
                     var2.n5("border-bottom-style", var23, null);
                     var2.n5("border-top-width", var19, null);
                     var2.n5("border-top-style", var23, null);
               }
            }
         }

         if (var3.t2("bordercolor")) {
            String var11 = var3.u3("bordercolor");
            if (!d1.n5(var11)) {
               com.aspose.slides.internal.r7c.u3 var20 = l6.l6(var11);
               if (var20.u3()) {
                  var11 = d1.n5(new String[]{"#", var20.k5()});
               }

               var2.n5("border-color", var11, null);
               var2.n5("border-style", "solid", null);
            }
         }

         if (var3.t2("cellpadding")) {
            String var12 = var3.u3("cellpadding");
            if (!d1.n5(var12)) {
               var2.n5("padding", var12, null);
            }
         }
      }

      if (var1.t2("align")) {
         String var13 = var1.u3("align");
         if (!d1.n5(var13)) {
            var2.n5("text-align", var13, null);
         }
      }

      if (var1.t2("valign")) {
         String var14 = var1.u3("valign");
         if (!d1.n5(var14)) {
            var2.n5("vertical-align", var14, null);
         }
      }

      if (var1.t2("width")) {
         String var15 = var1.u3("width");
         if (!d1.n5(var15)) {
            var2.n5("width", var15, null);
         }
      }

      if (var1.t2("height")) {
         String var16 = var1.u3("height");
         if (!d1.n5(var16)) {
            var2.n5("height", var16, null);
         }
      }

      if (var1.t2("bgcolor")) {
         String var17 = var1.u3("bgcolor");
         if (!d1.n5(var17)) {
            com.aspose.slides.internal.r7c.u3 var21 = l6.l6(var17);
            if (var21.u3()) {
               var17 = d1.n5(new String[]{"#", var21.k5()});
            }

            var2.n5("background-color", var17, null);
         }
      }
   }

   private void u9(com.aspose.slides.internal.j3.z3 var1, m1 var2) {
      if (var1.t2("bgcolor")) {
         String var3 = var1.u3("bgcolor");
         if (!d1.n5(var3)) {
            com.aspose.slides.internal.r7c.u3 var4 = l6.l6(var3);
            if (var4.u3()) {
               var3 = d1.n5(new String[]{"#", var4.k5()});
            }

            var2.n5("background-color", var3, null);
         }
      }
   }

   private void n5(com.aspose.slides.internal.k5.m3 var1, String var2, String var3, String var4, m1 var5) {
      com.aspose.slides.internal.k5.u9 var6 = var1.e0(var2);
      if (var6 != null) {
         var5.n5(var2, var6, false);
         var6 = var1.e0(var3);
         if (var6 != null) {
            var5.n5(var3, var6, false);
         }

         var6 = var1.e0(var4);
         if (var6 != null) {
            var5.n5(var4, var6, false);
         }
      }
   }

   private void h0(com.aspose.slides.internal.j3.z3 var1, m1 var2) {
      if (var1.t2("align")) {
         String var3 = var1.u3("align");
         if (!d1.n5(var3)) {
            var2.n5("text-align", var3, null);
         }
      }
   }

   private void c8(com.aspose.slides.internal.j3.z3 var1, m1 var2) {
      if (var1.t2("align")) {
         String var3 = var1.u3("align");
         if (!d1.n5(var3)) {
            var2.n5("float", var3, null);
         }
      }
   }

   private static com.aspose.slides.internal.j3.z3 n5(com.aspose.slides.internal.j3.z3 var0, String var1, int var2) {
      com.aspose.slides.internal.j3.z3 var3 = var0;

      while (var2 > 0 && var3.a5() != null && var3.a5().n3() == 1) {
         var3 = (com.aspose.slides.internal.j3.z3)var3.a5();
         if (d1.a6(var3.a6(), var1)) {
            return var3;
         }

         var2--;
      }

      return null;
   }

   private static String n5(int var0) {
      switch (var0) {
         case 1:
            return "xx-small";
         case 2:
            return "small";
         case 3:
            return "medium";
         case 4:
            return "large";
         case 5:
            return "x-large";
         case 6:
            return "xx-large";
         case 7:
            return "xxx-large";
         default:
            return var0 < 1 ? "small" : "xxx-large";
      }
   }
}
