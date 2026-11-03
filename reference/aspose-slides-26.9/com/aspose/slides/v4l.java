package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

class v4l extends i1t {
   private final Dictionary<com.aspose.slides.internal.h6.n5, u2q> n5 = new Dictionary<>();
   private final List<com.aspose.slides.internal.h6.n5> l6 = new List<>();

   public v4l(k3w var1, com.aspose.slides.internal.h6.n5 var2) {
      super(var1, var2);
   }

   final void n5(com.aspose.slides.internal.f4.l6 var1, com.aspose.slides.internal.e1.m3 var2, e8x var3) {
      u2q var4 = null;
      com.aspose.slides.internal.h6.n5 var5 = (com.aspose.slides.internal.h6.n5)var1.l6();
      u2q[] var6 = new u2q[]{var4};
      boolean var7 = !this.n5.tryGetValue(var5, var6);
      var4 = var6[0];
      if (var7) {
         var4 = new u2q(var1.k5().y4(), var5, this.n5());
         this.n5.addItem(var5, var4);
         this.l6.addItem(var5);
      }

      var4.n5(var2);
   }

   private static float n5(float var0) {
      return (float)com.aspose.slides.ms.System.q1.u3(var0 / 6.0F) * 6.0F;
   }

   final Table n5(ShapeCollection var1, boolean var2) {
      SortedList var3 = new SortedList();
      SortedList var4 = new SortedList();
      SortedList var5 = new SortedList();
      SortedList var6 = new SortedList();
      com.aspose.slides.internal.f4.n5 var7 = com.aspose.slides.internal.v6g.k5.n5(this.n5().l6(), com.aspose.slides.internal.f4.n5.class);
      Dictionary$Enumerator var8 = this.n5.iterator();

      try {
         while (var8.hasNext()) {
            KeyValuePair var9 = (KeyValuePair)var8.next();
            com.aspose.slides.internal.o9b.y1 var10 = e8x.n5(var7.n5((com.aspose.slides.internal.j3.z3)var9.getKey(), this.n5().h0().getKey())).y4();
            if (!var10.u3()) {
               var3.set_Item(n5(var10.t2()), true);
               var4.set_Item(n5(var10.l6()), true);
               var5.set_Item(n5(var10.a6()), true);
               var6.set_Item(n5(var10.h0()), true);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      if (var3.size() >= 1 && var5.size() >= 1) {
         double[] var85 = new double[com.aspose.slides.ms.System.q1.n5(var5.size(), var6.size())];
         double[] var86 = new double[com.aspose.slides.ms.System.q1.n5(var3.size(), var4.size())];

         for (int var11 = 0; var11 < var85.length; var11++) {
            if (var11 > var5.size() - 1) {
               var85[var11] = (Float)var6.getKeys().get_Item(var11) - (Float)var6.getKeys().get_Item(var11 - 1);
            } else if (var11 > var6.size() - 1) {
               var85[var11] = (Float)var5.getKeys().get_Item(var11) - (Float)var5.getKeys().get_Item(var11 - 1);
            } else {
               var85[var11] = (Float)var6.getKeys().get_Item(var11) - (Float)var5.getKeys().get_Item(var11);
            }
         }

         for (int var87 = 0; var87 < var86.length; var87++) {
            if (var87 > var3.size() - 1) {
               var86[var87] = (Float)var4.getKeys().get_Item(var87) - (Float)var4.getKeys().get_Item(var87 - 1);
            } else if (var87 > var4.size() - 1) {
               var86[var87] = (Float)var3.getKeys().get_Item(var87) - (Float)var3.getKeys().get_Item(var87 - 1);
            } else {
               var86[var87] = (Float)var4.getKeys().get_Item(var87) - (Float)var3.getKeys().get_Item(var87);
            }
         }

         Table var88 = (Table)var1.addTable((Float)var5.getKeys().get_Item(0), this.l6().k5(), var85, var86);
         var88.setStylePreset(3);
         FontData var12 = new FontData("Times New Roman");
         IGenericEnumerator var13 = var88.getRows().iterator();

         try {
            while (var13.hasNext()) {
               IRow var14 = (IRow)var13.next();
               IGenericEnumerator var15 = var14.iterator();

               try {
                  while (var15.hasNext()) {
                     ICell var16 = (ICell)var15.next();
                     ((TextFrameFormat)var16.getTextFrame().getTextFrameFormat()).n5(c0u.n5.l6());
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
                     var15.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }

         List$Enumerator var89 = this.l6.iterator();

         try {
            while (var89.hasNext()) {
               com.aspose.slides.internal.h6.n5 var90 = (com.aspose.slides.internal.h6.n5)var89.next();
               com.aspose.slides.internal.f4.l6 var92 = var7.n5(var90, this.n5().h0().getKey());
               com.aspose.slides.internal.o9b.y1 var17 = e8x.n5(var92).y4();
               if (!var17.u3()) {
                  int var18 = var5.indexOfKey(n5(var17.a6()));
                  int var19 = var6.indexOfKey(n5(var17.h0()));
                  int var20 = var3.indexOfKey(n5(var17.t2()));
                  int var21 = var4.indexOfKey(n5(var17.l6()));
                  if (var19 < var88.getColumns().size() && var21 < var88.getRows().size() && (var19 - var18 > 0 || var21 - var20 > 0)) {
                     var88.mergeCells(var88.get_Item(var18, var20), var88.get_Item(var19, var21), false);
                  }

                  com.aspose.slides.internal.t9.u3 var22 = ((com.aspose.slides.internal.w5.k5)var90).a3();
                  Cell var23 = (Cell)var88.get_Item(var18, var20);
                  var23.getTextFrame().getParagraphs().clear();
                  this.n5(var23, var22);
                  e1r var24 = this.n5.get_Item(var90).n5();
                  var24.n5((TextFrame)var23.getTextFrame());
                  if (var2) {
                     var24.n5(var23.getTextFrame());
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var89, IDisposable.class)) {
               var89.dispose();
            }
         }

         IGenericEnumerator var91 = var88.getRows().iterator();

         try {
            while (var91.hasNext()) {
               IRow var93 = (IRow)var91.next();
               IGenericEnumerator var94 = var93.iterator();

               try {
                  while (var94.hasNext()) {
                     ICell var95 = (ICell)var94.next();
                     IGenericEnumerator var96 = var95.getTextFrame().getParagraphs().iterator();

                     try {
                        while (var96.hasNext()) {
                           IParagraph var97 = (IParagraph)var96.next();
                           var97.getParagraphFormat().getDefaultPortionFormat().setLatinFont(var12);
                           var97.getParagraphFormat().getDefaultPortionFormat().setFontHeight(a2s.n5[2]);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var96, IDisposable.class)) {
                           var96.dispose();
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var94, IDisposable.class)) {
                     var94.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var91, IDisposable.class)) {
               var91.dispose();
            }
         }

         var88.c8();
         return var88;
      } else {
         return null;
      }
   }

   private void n5(Cell var1, com.aspose.slides.internal.t9.u3 var2) {
      var1.setMarginLeft(e8x.n5(var2.v4().u3(), (float)var1.getWidth(), 0.0F, 0.0F));
      var1.setMarginTop(e8x.n5(var2.v4().n5(), (float)var1.getHeight(), 0.0F, 0.0F));
      var1.setMarginRight(e8x.n5(var2.v4().l6(), (float)var1.getWidth(), 0.0F, 0.0F));
      var1.setMarginBottom(e8x.n5(var2.v4().k5(), (float)var1.getHeight(), 0.0F, 0.0F));
      if (var2.v3().h0()) {
         switch (var2.v3().c8()) {
            case 3:
            case 4:
            default:
               var1.setTextAnchorType((byte)0);
               break;
            case 5:
               var1.setTextAnchorType((byte)1);
               break;
            case 6:
            case 7:
               var1.setTextAnchorType((byte)2);
         }
      } else {
         var1.getTextFrame().getTextFrameFormat().setAnchoringType((byte)1);
      }

      if (var2.j9() == 2) {
         var1.setAnchorCenter(true);
      }

      n5((LineFormat)var1.getCellFormat().getBorderLeft(), var2.s7().n5());
      n5((LineFormat)var1.getCellFormat().getBorderTop(), var2.s7().k5());
      n5((LineFormat)var1.getCellFormat().getBorderRight(), var2.s7().l6());
      n5((LineFormat)var1.getCellFormat().getBorderBottom(), var2.s7().u3());
      this.n5((FillFormat)var1.getCellFormat().getFillFormat(), var2.c8());
   }

   private static void n5(LineFormat var0, com.aspose.slides.internal.q0.k5 var1) {
      double var2 = n5(var1);
      if (var0.isFormatNotDefined() || !(var0.getWidth() > var2)) {
         var0.setWidth(var2);
         switch (var1.k5()) {
            case 0:
            case 1:
               var0.getFillFormat().setFillType((byte)0);
               return;
            case 2:
               var0.setStyle((byte)0);
               var0.setDashStyle((byte)1);
               break;
            case 3:
               var0.setStyle((byte)0);
               var0.setDashStyle((byte)2);
               break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
               var0.setStyle((byte)0);
               var0.setDashStyle((byte)0);
               break;
            case 5:
               var0.setStyle((byte)1);
               var0.setDashStyle((byte)0);
         }

         var0.getFillFormat().setFillType((byte)1);
         ((ColorFormat)var0.getFillFormat().getSolidFillColor()).n5(var1.n5().o8());
      }
   }

   private static double n5(com.aspose.slides.internal.q0.k5 var0) {
      if (var0.l6().h0()) {
         return e8x.n5(var0.l6().t2(), 0.0F, 0.0F, 0.0F) / 0.75F;
      }

      switch (var0.l6().c8()) {
         case 0:
            return 1.0;
         case 2:
            return 3.0;
         default:
            return 2.0;
      }
   }

   private void n5(FillFormat var1, com.aspose.slides.internal.q0.n5 var2) {
      if (!var2.l6().t2()) {
         String var3 = this.n5().k5().n5(this.n5().u3(), var2.l6().h0());
         if (var3 != null) {
            com.aspose.slides.internal.z0k.t4 var4 = this.n5().k5().n5(var3);

            try {
               if (var4 != null) {
                  IPPImage var5 = ((ImageCollection)this.n5().u9()).n5(var4);
                  var1.setFillType((byte)4);
                  var1.getPictureFillFormat().setPictureFillMode(0);
                  var1.getPictureFillFormat().getPicture().setImage(var5);
                  e4c var6 = new e4c(e8x.n5(var2.k5().h0(), 0.0F, 0.0F, 0.0F), e8x.n5(var2.k5().c8(), 0.0F, 0.0F, 0.0F));
                  ((PictureFillFormat)var1.getPictureFillFormat()).h0().n5(var6.u9());
                  d2k var7 = new d2k(
                     e8x.n5(var2.u9().h0().h0(), 0.0F, 0.0F, 0.0F) / var5.getWidth(), e8x.n5(var2.u9().c8().h0(), 0.0F, 0.0F, 0.0F) / var5.getHeight()
                  );
                  ((PictureFillFormat)var1.getPictureFillFormat()).h0().n5(var7.u3());
               }
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         }
      }

      if (!var2.n5().t2()) {
         var1.setFillType((byte)1);
         ((ColorFormat)var1.getSolidFillColor()).n5(var2.n5().o8());
      }
   }
}
