package com.aspose.slides.internal.c6;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ICell;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class d5 extends r4 {
   private final z8 n5;
   private final int l6;
   private final int k5;

   public d5(ISlide var1, z8 var2, int var3, int var4) {
      super(var1, "Content ");
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
   }

   @Override
   protected void n5(IAutoShape var1) {
      int var2 = n5(this.n5.k5(), this.n5.u3());
      double[] var3 = n5(this.n5.u3(), var2, var1.getWidth());
      int var4 = this.n5.u3().size() - this.l6;
      if (var4 > this.k5) {
         var4 = this.k5;
      }

      double var5 = var1.getHeight() * 0.95 / (var4 + 1);
      double[] var7 = new double[var4 + 1];

      for (int var8 = 0; var8 <= var4; var8++) {
         var7[var8] = var5;
      }

      for (int var12 = 24; var12 >= 8; var12--) {
         ITable var9 = var1.getSlide().getShapes().addTable(var1.getX(), var1.getY(), var3, var7);

         for (int var10 = 0; var10 < var2 && var10 < this.n5.k5().size(); var10++) {
            n5(var9.getRows().get_Item(0).get_Item(var10), this.n5.k5().get_Item(var10), true, var12);
         }

         for (int var13 = 0; var13 < var4; var13++) {
            for (int var11 = 0; var11 < var2 && var11 < this.n5.u3().get_Item(this.l6 + var13).n5().size(); var11++) {
               n5(var9.getRows().get_Item(var13 + 1).get_Item(var11), this.n5.u3().get_Item(this.l6 + var13).n5().get_Item(var11), false, var12);
            }
         }

         if (var9.getHeight() <= var1.getHeight()) {
            break;
         }

         var1.getSlide().getShapes().remove(var9);
      }

      var1.getSlide().getShapes().remove(var1);
   }

   private static int n5(List<String> var0, List<m3> var1) {
      int var2 = var0.size();
      List$Enumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            m3 var4 = (m3)var3.next();
            if (var4.n5().size() > var2) {
               var2 = var4.n5().size();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private static double[] n5(List<m3> var0, int var1, double var2) {
      double var4 = 0.0;
      double[] var6 = new double[var1];
      List$Enumerator var7 = var0.iterator();

      try {
         while (var7.hasNext()) {
            m3 var8 = (m3)var7.next();

            for (int var9 = 0; var9 < var1 && var9 < var8.n5().size(); var9++) {
               if (var8.n5().get_Item(var9).length() > var6[var9]) {
                  var6[var9] = var8.n5().get_Item(var9).length();
               }

               if (var8.n5().get_Item(var9).length() > var4) {
                  var4 = var8.n5().get_Item(var9).length();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      var4 *= 0.3;
      double var11 = 0.0;

      for (int var10 = 0; var10 < var1; var10++) {
         if (var6[var10] < var4) {
            var6[var10] = var4;
         }

         var11 += var6[var10];
      }

      for (int var16 = 0; var16 < var1; var16++) {
         var6[var16] *= var2 / var11;
      }

      return var6;
   }

   private static void n5(ICell var0, String var1, boolean var2, float var3) {
      var0.getTextFrame().getParagraphs().clear();
      var0.getTextFrame().getTextFrameFormat().getTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat().setFontHeight(var3);
      var0.getTextFrame().setText(" ");
      var0.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().setFontHeight(var3);
      var0.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(var3);
      t4.n5(var0.getTextFrame().getParagraphs().get_Item(0), var1);
      var0.setTextAnchorType((byte)1);
      if (var2) {
         var0.getCellFormat().getFillFormat().setFillType((byte)1);
         var0.getCellFormat()
            .getFillFormat()
            .getSolidFillColor()
            .setColor(com.aspose.slides.internal.o9b.c8.l6(com.aspose.slides.internal.o9b.c8.n5(245, 249, 255).o8()));
      } else {
         var0.getCellFormat().getFillFormat().setFillType((byte)0);
      }

      var0.getCellFormat().getBorderLeft().getFillFormat().setFillType((byte)0);
      var0.getCellFormat().getBorderRight().getFillFormat().setFillType((byte)0);
      var0.getCellFormat().getBorderTop().getFillFormat().setFillType((byte)1);
      var0.getCellFormat()
         .getBorderTop()
         .getFillFormat()
         .getSolidFillColor()
         .setColor(com.aspose.slides.internal.o9b.c8.l6(com.aspose.slides.internal.o9b.c8.n5(212, 228, 252).o8()));
      var0.getCellFormat().getBorderBottom().getFillFormat().setFillType((byte)1);
      var0.getCellFormat()
         .getBorderBottom()
         .getFillFormat()
         .getSolidFillColor()
         .setColor(com.aspose.slides.internal.o9b.c8.l6(com.aspose.slides.internal.o9b.c8.n5(212, 228, 252).o8()));
      IGenericEnumerator var4 = var0.getTextFrame().getParagraphs().iterator();

      try {
         while (var4.hasNext()) {
            IParagraph var5 = (IParagraph)var4.next();
            IGenericEnumerator var6 = var5.getPortions().iterator();

            try {
               while (var6.hasNext()) {
                  IPortion var7 = (IPortion)var6.next();
                  var7.getPortionFormat().getFillFormat().setFillType((byte)1);
                  var7.getPortionFormat()
                     .getFillFormat()
                     .getSolidFillColor()
                     .setColor(com.aspose.slides.internal.o9b.c8.l6(com.aspose.slides.internal.o9b.c8.n5(87, 90, 123).o8()));
                  if (var2) {
                     var7.getPortionFormat().setFontBold((byte)1);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }
}
