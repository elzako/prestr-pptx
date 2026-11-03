package com.aspose.slides;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public final class Column extends CellCollection implements IColumn {
   int l6 = -1;
   double k5 = 0.0;
   boolean u3 = false;
   private double a6;
   private ColumnFormat u9;

   Column(ColumnCollection parentImmediate, double width) {
      super(parentImmediate);
      this.a6 = width;
      this.u9 = new ColumnFormat(this);
   }

   @Override
   public final double getWidth() {
      return this.a6;
   }

   @Override
   public final void setWidth(double value) {
      if (this.a6 != value) {
         this.u9().c8();
         this.t2();
      }

      this.a6 = value;
   }

   @Override
   public final void setTextFormat(IPortionFormat source) {
      IGenericEnumerator var2 = this.n5().getRows().iterator();

      try {
         while (var2.hasNext()) {
            Row var3 = (Row)var2.next();
            IGenericEnumerator var4 = var3.get_Item(this.h0()).getTextFrame().getParagraphs().iterator();

            try {
               while (var4.hasNext()) {
                  Paragraph var5 = (Paragraph)var4.next();
                  IGenericEnumerator var6 = var5.getPortions().iterator();

                  try {
                     while (var6.hasNext()) {
                        Portion var7 = (Portion)var6.next();
                        ((PortionFormat)var7.getPortionFormat()).l6((BasePortionFormat)source);
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
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final void setTextFormat(IParagraphFormat source) {
      IGenericEnumerator var2 = this.n5().getRows().iterator();

      try {
         while (var2.hasNext()) {
            Row var3 = (Row)var2.next();
            IGenericEnumerator var4 = var3.get_Item(this.h0()).getTextFrame().getParagraphs().iterator();

            try {
               while (var4.hasNext()) {
                  Paragraph var5 = (Paragraph)var4.next();
                  ((ParagraphFormat)var5.getParagraphFormat()).n5(source);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final void setTextFormat(ITextFrameFormat source) {
      IGenericEnumerator var2 = this.n5().getRows().iterator();

      try {
         while (var2.hasNext()) {
            Row var3 = (Row)var2.next();
            ((TextFrameFormat)var3.get_Item(this.h0()).getTextFrame().getTextFrameFormat()).l6(source);
            ((Cell)var3.get_Item(this.h0())).n5(source);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final IColumnFormat getColumnFormat() {
      return this.u9;
   }

   final ColumnCollection u9() {
      return com.aspose.slides.internal.v6g.k5.n5(this.getParent_Immediate(), ColumnCollection.class);
   }

   final int h0() {
      this.u9().u9();
      return this.l6;
   }

   final double c8() {
      this.u9().h0();
      return this.k5;
   }

   @Override
   Table n5() {
      return this.u9().n5();
   }

   final void t2() {
      if (!this.u3) {
         this.u3 = true;
         int var1 = 0;

         while (var1 < this.size()) {
            Cell var2 = this.n5(var1).a6();
            var2.e2();
            var1 += var2.getRowSpan();
         }

         this.n5().z1();
      }
   }

   @Override
   int l6() {
      return this.u9().l6().size();
   }

   @Override
   Cell n5(int var1) {
      return this.u9().l6().n5(var1).n5(this.h0());
   }

   @Override
   IGenericEnumerator<ICell> k5() {
      List var1 = new List(this.size());

      for (int var2 = 0; var2 < this.size(); var2++) {
         var1.addItem(this.n5(var2));
      }

      return new com.aspose.slides.internal.n8e.f5<>(var1.iterator().Clone(), n5, null);
   }

   @Override
   IGenericEnumerator<ICell> u3() {
      List var1 = new List(this.size());

      for (int var2 = 0; var2 < this.size(); var2++) {
         var1.addItem(this.n5(var2));
      }

      return new com.aspose.slides.internal.n8e.j3<>(var1.iteratorJava().Clone(), n5, null);
   }

   @Override
   void n5(com.aspose.slides.ms.System.u3 var1, int var2) {
      if (this.size() >= 1) {
         ArrayList var3 = new ArrayList(this.size());

         for (int var4 = 0; var4 < this.size(); var4++) {
            var3.addItem(this.get_Item(var4));
         }

         var3.copyTo(0, var1, var2, this.size());
      }
   }
}
