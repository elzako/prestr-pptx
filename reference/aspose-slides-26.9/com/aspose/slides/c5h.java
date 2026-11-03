package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class c5h {
   private static final List<String> n5 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("p", "list");

   public static Shape n5(ShapeCollection var0, com.aspose.slides.internal.k4y.b4f var1, com.aspose.slides.internal.k4y.y7e var2, h6j var3) {
      if (var0 == null) {
         throw new ArgumentNullException("shapes");
      }

      if (var2 == null) {
         throw new ArgumentNullException("tableElement");
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var1.c8(), var1.t2(), var1.s7(), var1.x8()).y4();
      double[] var5 = l6(var2, var3);
      double[] var6 = n5(var2, var3);
      Table var7 = (Table)var0.addTable(var4.x8(), var4.n3(), var5, var6);
      var7.setStylePreset(0);
      var7.setFirstRow(var2.k5());
      var7.setFirstCol(var2.a6());
      var7.setLastRow(var2.u3());
      var7.setLastCol(var2.u9());
      var7.setHorizontalBanding(var2.h0());
      var7.setVerticalBanding(var2.c8());
      com.aspose.slides.internal.k4y.r5v var8 = null;
      if (t2f.k5(var2.l6()) && var3.l6().n3().containsKey(var2.l6())) {
         var8 = var3.l6().n3().get_Item(var2.l6());
      }

      n5(var7, var1, var2, var8, var3);
      return var7;
   }

   private static void n5(
      Table var0, com.aspose.slides.internal.k4y.b4f var1, com.aspose.slides.internal.k4y.y7e var2, com.aspose.slides.internal.k4y.r5v var3, h6j var4
   ) {
      com.aspose.slides.internal.k4y.y2i var5 = null;
      if (var3 != null && var3.x8() != null) {
         com.aspose.slides.internal.k4y.o1c var6 = (com.aspose.slides.internal.k4y.o1c)var3.x8().k5();
         String var7 = var6.n5();
         if (var7 == null) {
            var7 = var6.l6();
         }

         var5 = n7n.n5(var7, var4);
      } else if ("default".equals(var2.l6())) {
         var5 = n7n.n5("default", var4);
      }

      for (int var28 = 0; var28 < var2.s7().size(); var28++) {
         com.aspose.slides.internal.k4y.y2i var29 = n5(var28, var2, var3, var4);
         com.aspose.slides.internal.k4y.g7 var8 = var2.s7().get_Item(var28);
         com.aspose.slides.internal.k4y.w1x var9 = (com.aspose.slides.internal.k4y.w1x)var8.l6();
         com.aspose.slides.internal.k4y.y2i var10 = n7n.n5(var9.n5(), var4);
         com.aspose.slides.internal.k4y.y2i var11 = n7n.n5(var9.l6(), var4);

         for (int var12 = 0; var12 < var9.k5().size(); var12++) {
            com.aspose.slides.internal.k4y.y2i var13 = n5(var12, var2, var9, var3, var4);
            com.aspose.slides.internal.k4y.g7 var14 = var2.t2().get_Item(var12);
            com.aspose.slides.internal.k4y.l5h var15 = (com.aspose.slides.internal.k4y.l5h)var14.l6();
            com.aspose.slides.internal.k4y.y2i var16 = n7n.n5(var15.n5(), var4);
            Cell var17 = var0.n5(var12, var28);
            com.aspose.slides.internal.k4y.g7 var18 = var9.k5().get_Item(var12);
            List var20;
            com.aspose.slides.internal.k4y.y2i var21;
            if (com.aspose.slides.internal.v6g.k5.l6(var18.l6(), com.aspose.slides.internal.k4y.s6g.class)) {
               com.aspose.slides.internal.k4y.s6g var19 = (com.aspose.slides.internal.k4y.s6g)var18.l6();
               var20 = var19.l6();
               var21 = n7n.n5(var19.n5(), var4);
            } else {
               com.aspose.slides.internal.k4y.p6d var30 = (com.aspose.slides.internal.k4y.p6d)var18.l6();
               var20 = var30.x8();
               var21 = n7n.n5(var30.n5(), var4);
               var17.l6 = (int)var30.t2();
               var17.n5 = (int)var30.s7();
               var17.k5 = null;
               if (var17.h0()) {
                  var17.l6(false);
               }
            }

            com.aspose.slides.internal.k4y.y2i var31 = n7n.n5(var1.k5(), var4);
            n5(var31, var17, false, var4);
            n5(var5, var17, true, var4);
            n5(var13, var17, false, var4);
            n5(var29, var17, false, var4);
            n5(var16, var17, false, var4);
            n5(var10, var17, false, var4);
            n5(var11, var17, false, var4);
            n5(var21, var17, false, var4);
            TextFrame var22 = (TextFrame)var17.getTextFrame();
            if (var20.size() > 0) {
               var22.getParagraphs().clear();
            }

            IGenericEnumerator var23 = var20.iterator();

            try {
               while (var23.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var24 = (com.aspose.slides.internal.k4y.g7)var23.next();
                  switch (l6.n5(var24.n5())) {
                     case 0:
                        n5((com.aspose.slides.internal.k4y.u1x)var24.l6(), var1, var22, var4);
                        break;
                     case 1:
                        n5((com.aspose.slides.internal.k4y.u0y)var24.l6(), var1, var22, var4);
                        break;
                     default:
                        var4.n5().n5(com.aspose.slides.ms.System.d1.n5("Unknown table content element: {0}", new Object[]{var24.n5()}), 1);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
                  var23.dispose();
               }
            }

            n5(var17);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.u1x var0, com.aspose.slides.internal.k4y.b4f var1, TextFrame var2, h6j var3) {
      h2k var4 = h2k.n5(var1.u3(), 10);
      l4t.n5(var2, new com.aspose.slides.internal.k4y.u1x[]{var0}, var3, var4);
   }

   private static void n5(com.aspose.slides.internal.k4y.u0y var0, com.aspose.slides.internal.k4y.b4f var1, TextFrame var2, h6j var3) {
      com.aspose.slides.internal.k4y.a8r var4 = var3.u3().containsKey(var0.k5()) ? var3.u3().get_Item(var0.k5()) : null;
      h2k var5 = h2k.n5(var1.u3(), 10);
      if (var0.u3() != null) {
         d7g.n5(var2, var0, var4, var3, var5);
      }

      q4v var6 = new q4v(var1);
      e5f.n5(var2, var6, var0, var4, 1, var3, var5);
   }

   private static com.aspose.slides.internal.k4y.y2i n5(
      int var0, com.aspose.slides.internal.k4y.y7e var1, com.aspose.slides.internal.k4y.w1x var2, com.aspose.slides.internal.k4y.r5v var3, h6j var4
   ) {
      boolean var5 = var3 != null;
      String var6 = var1.l6();
      byte var7 = 1;
      if (var1.a6() && var0 == 0) {
         var7 = 3;
         if (var5 && var3.a6() != null) {
            String var11 = var3.a6().n5();
            if (var11 == null) {
               var11 = var3.a6().l6();
            }

            var6 = var11;
         }
      } else if (var1.u9() && var0 == var2.k5().size() - 1) {
         var7 = 3;
         if (var5 && var3.u9() != null) {
            String var10 = var3.u9().n5();
            if (var10 == null) {
               var10 = var3.u9().l6();
            }

            var6 = var10;
         }
      } else if (var1.c8()) {
         if (var0 % 2 == 0) {
            if (var5 && var3.t2() != null) {
               String var8 = var3.t2().n5();
               if (var8 == null) {
                  var8 = var3.t2().l6();
               }

               var6 = var8;
            }
         } else {
            var7 = 2;
            if (var5 && var3.s7() != null) {
               String var9 = var3.s7().n5();
               if (var9 == null) {
                  var9 = var3.s7().l6();
               }

               var6 = var9;
            }
         }
      }

      return n5(var6, var7, var1, var4);
   }

   private static com.aspose.slides.internal.k4y.y2i n5(int var0, com.aspose.slides.internal.k4y.y7e var1, com.aspose.slides.internal.k4y.r5v var2, h6j var3) {
      boolean var4 = var2 != null;
      String var5 = var1.l6();
      byte var6 = 1;
      if (var1.k5() && var0 == 0) {
         var6 = 3;
         if (var4 && var2.k5() != null) {
            String var10 = var2.k5().n5();
            if (var10 == null) {
               var10 = var2.k5().l6();
            }

            var5 = var10;
         }
      } else if (var1.u3() && var0 == var1.s7().size() - 1) {
         var6 = 3;
         if (var4 && var2.u3() != null) {
            String var9 = var2.u3().n5();
            if (var9 == null) {
               var9 = var2.u3().l6();
            }

            var5 = var9;
         }
      } else if (var1.h0()) {
         if (var0 % 2 == 0) {
            if (var4 && var2.h0() != null) {
               String var7 = var2.h0().n5();
               if (var7 == null) {
                  var7 = var2.h0().l6();
               }

               var5 = var7;
            }
         } else {
            var6 = 2;
            if (var4 && var2.c8() != null) {
               String var8 = var2.c8().n5();
               if (var8 == null) {
                  var8 = var2.c8().l6();
               }

               var5 = var8;
            }
         }
      }

      return n5(var5, var6, var1, var3);
   }

   private static com.aspose.slides.internal.k4y.y2i n5(String var0, int var1, com.aspose.slides.internal.k4y.y7e var2, h6j var3) {
      if ("default".equals(var2.l6())) {
         List$Enumerator var4 = n5.iterator();

         try {
            while (var4.hasNext()) {
               String var5 = (String)var4.next();
               com.aspose.slides.internal.k4y.y2i var6 = n7n.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5, com.aspose.slides.ms.System.a3.l6(var1)}), var3);
               if (var6 != null) {
                  return var6;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      } else if (!com.aspose.slides.ms.System.d1.n5(var0)) {
         return n7n.n5(var0, var3);
      }

      return null;
   }

   private static void n5(com.aspose.slides.internal.k4y.y2i var0, Cell var1, boolean var2, h6j var3) {
      if (var0 != null) {
         if (t2f.k5(var0.l6())) {
            com.aspose.slides.internal.k4y.y2i var4 = n7n.n5(var0.l6(), var3);
            n5(var4, var1, false, var3);
         }

         com.aspose.slides.internal.k4y.p3w var7 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var0.u3());
         if (var7 != null) {
            t4e.n5(var1.getCellFormat().getFillFormat(), var7, var3);
            var1.setTextAnchorType(l6(var7.n3()));
            if (t2f.k5(var7.r4())) {
               var1.setMarginLeft(t2f.u9(var7.r4()));
            }

            if (t2f.k5(var7.j5())) {
               var1.setMarginTop(t2f.u9(var7.j5()));
            }

            if (t2f.k5(var7.c4())) {
               var1.setMarginRight(t2f.u9(var7.c4()));
            }

            if (t2f.k5(var7.w1())) {
               var1.setMarginBottom(t2f.u9(var7.w1()));
            }
         }

         com.aspose.slides.internal.k4y.v5n var5 = t2f.n5(com.aspose.slides.internal.k4y.v5n.class, "paragraph-properties", var0.u3());
         if (var5 != null) {
            ((CellFormat)var1.getCellFormat()).u3();
            if (t2f.k5(var5.t2())) {
               w7s.n5(var1.getCellFormat().getBorderLeft(), var5.t2(), false, var3);
               w7s.n5(var1.getCellFormat().getBorderTop(), var5.t2(), false, var3);
               w7s.n5(var1.getCellFormat().getBorderRight(), var5.t2(), false, var3);
               w7s.n5(var1.getCellFormat().getBorderBottom(), var5.t2(), false, var3);
            }

            if (t2f.k5(var5.s7()) && (var2 && var1.getFirstRowIndex() == 0 || !var2)) {
               w7s.n5(var1.getCellFormat().getBorderTop(), var5.s7(), false, var3);
            }

            if (t2f.k5(var5.n3()) && (var2 && var1.getFirstColumnIndex() == 0 || !var2)) {
               w7s.n5(var1.getCellFormat().getBorderLeft(), var5.n3(), false, var3);
            }

            if (t2f.k5(var5.x8()) && (var2 && var1.s7() == var1.k5().getRows().size() || !var2)) {
               w7s.n5(var1.getCellFormat().getBorderBottom(), var5.x8(), false, var3);
            }

            if (t2f.k5(var5.y4()) && (var2 && var1.t2() == var1.k5().getColumns().size() || !var2)) {
               w7s.n5(var1.getCellFormat().getBorderRight(), var5.y4(), false, var3);
            }

            if (var5.m1() == 3) {
               var1.setTextVerticalType((byte)1);
            }

            ((CellFormat)var1.getCellFormat()).a6();
         }

         com.aspose.slides.internal.k4y.b4u var6 = t2f.n5(com.aspose.slides.internal.k4y.b4u.class, "table-cell-properties", var0.u3());
         if (var6 != null) {
            t4e.n5(var1.getCellFormat().getFillFormat(), var6, var3);
            var1.setTextAnchorType(n5(var6.n5()));
            if (t2f.k5(var6.s7())) {
               var1.setMarginLeft(t2f.u9(var6.s7()));
            }

            if (t2f.k5(var6.c8())) {
               var1.setMarginTop(t2f.u9(var6.c8()));
            }

            if (t2f.k5(var6.x8())) {
               var1.setMarginRight(t2f.u9(var6.x8()));
            }

            if (t2f.k5(var6.t2())) {
               var1.setMarginBottom(t2f.u9(var6.t2()));
            }

            ((CellFormat)var1.getCellFormat()).u3();
            if (t2f.k5(var6.k5())) {
               w7s.n5(var1.getCellFormat().getBorderLeft(), var6.k5(), true, var3);
               w7s.n5(var1.getCellFormat().getBorderTop(), var6.k5(), true, var3);
               w7s.n5(var1.getCellFormat().getBorderRight(), var6.k5(), true, var3);
               w7s.n5(var1.getCellFormat().getBorderBottom(), var6.k5(), true, var3);
            }

            if (t2f.k5(var6.u3()) && (var2 && var1.getFirstRowIndex() == 0 || !var2)) {
               w7s.n5(var1.getCellFormat().getBorderTop(), var6.u3(), true, var3);
            }

            if (t2f.k5(var6.u9()) && (var2 && var1.getFirstColumnIndex() == 0 || !var2)) {
               w7s.n5(var1.getCellFormat().getBorderLeft(), var6.u9(), true, var3);
            }

            if (t2f.k5(var6.a6()) && (var2 && var1.s7() == var1.k5().getRows().size() || !var2)) {
               w7s.n5(var1.getCellFormat().getBorderBottom(), var6.a6(), true, var3);
            }

            if (t2f.k5(var6.h0()) && (var2 && var1.t2() == var1.k5().getColumns().size() || !var2)) {
               w7s.n5(var1.getCellFormat().getBorderRight(), var6.h0(), true, var3);
            }

            ((CellFormat)var1.getCellFormat()).a6();
         }

         n7n.n5((TextFrame)var1.getTextFrame(), var0.n5(), var3);
      }
   }

   private static double[] n5(com.aspose.slides.internal.k4y.y7e var0, h6j var1) {
      double[] var2 = new double[var0.s7().size()];

      for (int var3 = 0; var3 < var0.s7().size(); var3++) {
         com.aspose.slides.internal.k4y.g7 var4 = var0.s7().get_Item(var3);
         com.aspose.slides.internal.k4y.w1x var5 = (com.aspose.slides.internal.k4y.w1x)var4.l6();
         com.aspose.slides.internal.k4y.s6j var6 = n5(var5, var1);
         var2[var3] = t2f.u9(var6.n5());
      }

      return var2;
   }

   private static double[] l6(com.aspose.slides.internal.k4y.y7e var0, h6j var1) {
      double[] var2 = new double[var0.t2().size()];

      for (int var3 = 0; var3 < var0.t2().size(); var3++) {
         com.aspose.slides.internal.k4y.g7 var4 = var0.t2().get_Item(var3);
         com.aspose.slides.internal.k4y.l5h var5 = (com.aspose.slides.internal.k4y.l5h)var4.l6();
         com.aspose.slides.internal.k4y.n0l var6 = n5(var5, var1);
         var2[var3] = t2f.u9(var6.n5());
      }

      return var2;
   }

   private static com.aspose.slides.internal.k4y.n0l n5(com.aspose.slides.internal.k4y.l5h var0, h6j var1) {
      com.aspose.slides.internal.k4y.y2i var2 = n7n.n5(var0.n5(), var1);
      if (var2 == null) {
         throw new InvalidOperationException("Table column must have associated style");
      } else {
         com.aspose.slides.internal.k4y.n0l var3 = t2f.n5(com.aspose.slides.internal.k4y.n0l.class, "table-column-properties", var2.u3());
         if (var3 == null) {
            throw new InvalidOperationException("Table column must have associated style properties");
         } else {
            return var3;
         }
      }
   }

   private static com.aspose.slides.internal.k4y.s6j n5(com.aspose.slides.internal.k4y.w1x var0, h6j var1) {
      com.aspose.slides.internal.k4y.y2i var2 = n7n.n5(var0.n5(), var1);
      if (var2 == null) {
         throw new InvalidOperationException("Table row must have associated style");
      } else {
         com.aspose.slides.internal.k4y.s6j var3 = t2f.n5(com.aspose.slides.internal.k4y.s6j.class, "table-row-properties", var2.u3());
         if (var3 == null) {
            throw new InvalidOperationException("Table row must have associated style properties");
         } else {
            return var3;
         }
      }
   }

   private static byte n5(int var0) {
      switch (var0) {
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
            return 0;
         default:
            return 0;
      }
   }

   private static byte l6(int var0) {
      switch (var0) {
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
            return 3;
         default:
            return 0;
      }
   }

   private static void n5(Cell var0) {
      PortionFormat var1 = (PortionFormat)var0.getTextFrame().getTextFrameFormat().getTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat();
      if (!PortionFormat.u3(var1)) {
         IGenericEnumerator var2 = var0.getTextFrame().getParagraphs().iterator();

         try {
            while (var2.hasNext()) {
               Paragraph var3 = (Paragraph)var2.next();
               ((PortionFormat)var3.getParagraphFormat().getDefaultPortionFormat()).l6(var1);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   static {
      n5.addItem("gray");
      n5.addItem("bw");
      n5.addItem("orange");
      n5.addItem("turquoise");
      n5.addItem("blue");
      n5.addItem("sun");
      n5.addItem("earth");
      n5.addItem("green");
      n5.addItem("seetang");
      n5.addItem("lightblue");
      n5.addItem("yellow");
   }
}
