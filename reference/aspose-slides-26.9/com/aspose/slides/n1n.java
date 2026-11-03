package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class n1n extends x0q {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "application/vnd.ms-office.DrsShape+xml",
      "application/vnd.ms-office.DrsE2oDoc+xml",
      "application/vnd.ms-office.DrsConnector+xml",
      "application/vnd.ms-office.DrsPicture+xml",
      "application/vnd.ms-office.DrsInk+xml"
   );

   public n1n(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public n1n(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }

   final com.aspose.slides.internal.k4y.e2 n5(i1x var1) {
      this.n5();
      switch (n5.n5(this.t9().y4().n5())) {
         case 0:
            return new com.aspose.slides.internal.k4y.t4z(this.s7());
         case 1:
            var1.n5(this.t9());
            return new com.aspose.slides.internal.k4y.e7o(this.s7());
         case 2:
            return new com.aspose.slides.internal.k4y.h1u(this.s7());
         case 3:
         case 4:
            return new com.aspose.slides.internal.k4y.t4z(this.s7());
         default:
            this.n3();
            return null;
      }
   }

   final boolean n5(IShape var1, n4i var2) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, AutoShape.class)) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, Table.class) && !com.aspose.slides.internal.v6g.k5.l6(var1, SmartArt.class)) {
            return false;
         }

         this.y4();
         com.aspose.slides.internal.k4y.s1k var84 = new com.aspose.slides.internal.k4y.s1k();
         this.n5(var2.n5());
         if (com.aspose.slides.internal.v6g.k5.l6(var1, Table.class)) {
            var84.k5().n5().n5("http://schemas.openxmlformats.org/drawingml/2006/table");
            y7r.n5((Table)var1, var84, var2.n5());
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, SmartArt.class)) {
            var84.k5().n5().n5("http://schemas.openxmlformats.org/drawingml/2006/diagram");
            f2a.n5((SmartArt)var1, var84, var2);
            var84.n5().n5().n5(var1.getUniqueId());
         }

         var84.n5("p", this.x8(), "E2oFrame");
         this.e2();
         return true;
      } else {
         AutoShape var3 = (AutoShape)var1;
         List var4 = new List();
         List var5 = new List();
         List var6 = new List();
         List var7 = new List();
         if (var3.getTextFrame() != null) {
            if (var3.getTextFrame().getTextFrameFormat().getAutofitType() == 1) {
               s3z.l6(((TextFrame)var3.getTextFrame()).u3);
            }

            boolean var8 = var3.l6().s7().z1() != 1;
            IGenericEnumerator var9 = var3.getTextFrame().getParagraphs().iterator();

            try {
               while (var9.hasNext()) {
                  Paragraph var10 = (Paragraph)var9.next();
                  IGenericEnumerator var11 = var10.getPortions().iterator();

                  try {
                     while (var11.hasNext()) {
                        Portion var12 = (Portion)var11.next();
                        var4.addItem(var12.u9());
                        if (var8) {
                           com.aspose.slides.internal.l7h.a5 var13 = new com.aspose.slides.internal.l7h.a5();
                           String var14 = var12.u9();

                           for (int var15 = 0; var15 < var14.length(); var15++) {
                              if (com.aspose.slides.ms.System.d1.a6(
                                 com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.t9.q0(var14.charAt(var15))),
                                 com.aspose.slides.ms.System.t9.q0(var14.charAt(var15))
                              )) {
                                 var13.n5(' ');
                              } else {
                                 var13.n5('_');
                              }
                           }

                           var12.setText(var13.toString());
                        }

                        var5.addItem(var12.l6().j5());
                        var12.l6().n5(var12.l6().r4());
                        if (var12.k5()) {
                           ParagraphFormat var92 = (ParagraphFormat)((Field)var12.getField()).n5().n5();
                           var7.addItem(var92.y4());
                           var92.n5(var92.t9());
                           var92.u3().e2();
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                        var11.dispose();
                     }
                  }

                  var6.addItem(var10.n5().y4());
                  var10.n5().n5(var10.n5().t9());
                  var10.n5().u3().e2();
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }

            var3.c8();
         }

         FillFormat var85 = ((FillFormat)var3.getFillFormat()).a6();
         LineFormat var86 = ((LineFormat)var3.getLineFormat()).a6();
         IFillFormatEffectiveData var87 = var3.z3();
         if (var3.getShapeStyle() != null && !var3.getUseBackgroundFill()
            || var3.getShapeStyle() == null && var3.getFillFormat().getFillType() == -1
            || var3.getFillFormat().getFillType() > 2) {
            FillFormat var88 = new FillFormat(var3);
            var88.n5(var87);
            ((FillFormat)var3.getFillFormat()).n5((IFillFormat)var88);
         }

         ILineFormatEffectiveData var89 = var3.q0();
         if (var3.getShapeStyle() != null || var3.getLineFormat().getFillFormat().getFillType() == -1 || var3.getLineFormat().getFillFormat().getFillType() > 2
            )
          {
            LineFormat var90 = new LineFormat(var3);
            var90.n5(var89);
            ((LineFormat)var3.getLineFormat()).n5((ILineFormat)var90);
         }

         ShapeStyle var91 = null;
         if (var3.getShapeStyle() != null) {
            var91 = ((ShapeStyle)var3.getShapeStyle()).n5();
            var3.m1();
         }

         try {
            this.y4();
            com.aspose.slides.internal.k4y.x1u var93 = new com.aspose.slides.internal.k4y.x1u();
            if (var3.getTextFrame() != null
               && var3.getTextFrame().getParagraphs().getCount() > 0
               && var3.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().getFontHeight() == 11.0F) {
               var3.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().setFontHeight(Float.NaN);
            }

            this.n5(var2.n5());
            u4.n5(var3, var93, var2, null);
            var93.n5("p", this.x8(), "sp");
            this.e2();
            return true;
         } finally {
            if (var3.getTextFrame() != null) {
               int var25 = 0;
               int var26 = 0;
               IGenericEnumerator var27 = var3.getTextFrame().getParagraphs().iterator();

               try {
                  while (var27.hasNext()) {
                     Paragraph var28 = (Paragraph)var27.next();
                     IGenericEnumerator var29 = var28.getPortions().iterator();

                     try {
                        for (; var29.hasNext(); var25++) {
                           Portion var30 = (Portion)var29.next();
                           var30.setText((String)var4.get_Item(var25));
                           var30.l6().w1();
                           var30.l6().l6((BasePortionFormat)var5.get_Item(var25));
                           if (var30.k5()) {
                              ParagraphFormat var31 = (ParagraphFormat)((Field)var30.getField()).n5().n5();
                              var31.e2();
                              var31.n5((IParagraphFormat)var7.get_Item(0));
                              var7.removeAt(0);
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
                           var29.dispose();
                        }
                     }

                     var28.n5().e2();
                     var28.n5().n5((IParagraphFormat)var6.get_Item(var26));
                     var26++;
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
                     var27.dispose();
                  }
               }

               var3.c8();
            }

            ((FillFormat)var3.getFillFormat()).n5((IFillFormat)var85);
            ((LineFormat)var3.getLineFormat()).n5((ILineFormat)var86);
            if (var91 != null) {
               var3.z1();
               ((ShapeStyle)var3.getShapeStyle()).n5(var91);
            }
         }
      }
   }

   private void n5(g6c var1) {
      IGenericEnumerator var2 = var1.t2().getMasters().iterator();

      try {
         while (var2.hasNext()) {
            MasterSlide var3 = (MasterSlide)var2.next();
            if (!var1.l6().containsKey(var3)) {
               var1.l6()
                  .addItem(var3, com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/slideMasters/slideMaster", com.aspose.slides.ms.System.a3.l6(var1.a0()), ".xml"}));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var19 = var1.t2().getLayoutSlides().iterator();

      try {
         while (var19.hasNext()) {
            LayoutSlide var4 = (LayoutSlide)var19.next();
            if (!var1.l6().containsKey(var4)) {
               var1.l6()
                  .addItem(var4, com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/slideLayouts/slideLayout", com.aspose.slides.ms.System.a3.l6(var1.c4()), ".xml"}));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }

      IGenericEnumerator var20 = var1.t2().getSlides().iterator();

      try {
         while (var20.hasNext()) {
            Slide var5 = (Slide)var20.next();
            if (!var1.l6().containsKey(var5)) {
               var1.l6().addItem(var5, com.aspose.slides.ms.System.d1.n5(new String[]{"/ppt/slides/slide", com.aspose.slides.ms.System.a3.l6(var1.d5()), ".xml"}));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
            var20.dispose();
         }
      }
   }
}
