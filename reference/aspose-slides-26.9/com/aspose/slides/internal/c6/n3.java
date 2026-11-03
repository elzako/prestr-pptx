package com.aspose.slides.internal.c6;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IAxesManager;
import com.aspose.slides.ICell;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartCategory;
import com.aspose.slides.IChartCategoryCollection;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.IChartSeriesCollection;
import com.aspose.slides.IChartTitle;
import com.aspose.slides.IComment;
import com.aspose.slides.ICommentAuthor;
import com.aspose.slides.ICommentAuthorCollection;
import com.aspose.slides.IGroupShape;
import com.aspose.slides.IMasterSlide;
import com.aspose.slides.IMasterSlideCollection;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.IRow;
import com.aspose.slides.IShape;
import com.aspose.slides.IShapeCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.ITable;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class n3 {
   private final String n5;
   private final String l6;

   public n3(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final e2 n5(IMasterSlideCollection var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            IMasterSlide var4 = (IMasterSlide)var3.next();
            var2.addItem(this.n5(var4.getShapes()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return new u9(var2);
   }

   public final e2 n5(ISlide var1) {
      List var2 = new List();
      var2.addItem(this.n5(var1.getShapes()));
      if (var1.getNotesSlideManager().getNotesSlide() != null) {
         this.n5(var1.getNotesSlideManager().getNotesSlide().getShapes());
      }

      var2.addItem(this.n5(var1.getSlideComments(null)));
      return new u9(var2);
   }

   public final e2 n5(ICommentAuthorCollection var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            ICommentAuthor var4 = (ICommentAuthor)var3.next();
            var2.addItem(new u3(var4));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return new u9(var2);
   }

   private e2 n5(IComment[] var1) {
      List var2 = new List();

      for (IComment var6 : var1) {
         var2.addItem(new a6(var6));
      }

      return new u9(var2);
   }

   private e2 n5(IShapeCollection var1) {
      List var2 = new List();
      if (var1 != null) {
         IGenericEnumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               IShape var4 = (IShape)var3.next();
               var2.addItem(this.n5(var4));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      return new u9(var2);
   }

   private e2 n5(IShape var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, IGroupShape.class)) {
         return this.n5(((IGroupShape)var1).getShapes());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IAutoShape.class)) {
         return this.n5(((IAutoShape)var1).getTextFrame());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, ITable.class)) {
         return this.n5((ITable)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IChart.class)) {
         return this.n5((IChart)var1);
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var1, ISmartArt.class) ? this.n5((ISmartArt)var1) : new z7();
      }
   }

   private e2 n5(ITable var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var1.getRows().iterator();

      try {
         while (var3.hasNext()) {
            IRow var4 = (IRow)var3.next();
            var2.addItem(this.n5(var4));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return new d2(var1, var2);
   }

   private e2 n5(IRow var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            ICell var4 = (ICell)var3.next();
            var2.addItem(this.n5(var4.getTextFrame(), "td"));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return new u9(var2, "tr");
   }

   private e2 n5(IChart var1) {
      if (var1.getChartData().getDataSourceType() == 1) {
         return new z7();
      }

      List var2 = new List();
      var2.addItem(this.n5(var1.getUserShapes().getShapes()));
      var2.addItem(this.n5(var1.getChartTitle()));
      var2.addItem(this.n5(var1.getAxes()));
      var2.addItem(this.n5(var1.getChartData().getCategories()));
      var2.addItem(this.n5(var1.getChartData().getSeries()));
      return new u9(var2);
   }

   private e2 n5(IAxesManager var1) {
      List var2 = new List();
      if (var1 != null) {
         var2.addItem(this.n5(var1.getHorizontalAxis().getTitle()));
         var2.addItem(this.n5(var1.getVerticalAxis().getTitle()));
         var2.addItem(this.n5(var1.getSecondaryHorizontalAxis().getTitle()));
         var2.addItem(this.n5(var1.getSecondaryVerticalAxis().getTitle()));
      }

      return new u9(var2);
   }

   private e2 n5(IChartTitle var1) {
      return this.n5(var1.getTextFrameForOverriding());
   }

   private e2 n5(IChartCategoryCollection var1) {
      List var2 = new List();
      if (var1 != null) {
         IGenericEnumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               IChartCategory var4 = (IChartCategory)var3.next();
               var2.addItem(new k5(var4));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      return new u9(var2);
   }

   private e2 n5(IChartSeriesCollection var1) {
      List var2 = new List();
      if (var1 != null) {
         IGenericEnumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               IChartSeries var4 = (IChartSeries)var3.next();
               var2.addItem(new w1(var4));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      return new u9(var2);
   }

   private e2 n5(ISmartArt var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var1.getAllNodes().iterator();

      try {
         while (var3.hasNext()) {
            ISmartArtNode var4 = (ISmartArtNode)var3.next();
            var2.addItem(this.n5(var4.getTextFrame()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return new u9(var2);
   }

   private e2 n5(ITextFrame var1) {
      return this.n5(var1, "div");
   }

   private e2 n5(ITextFrame var1, String var2) {
      List var3 = new List();
      if (var1 != null) {
         IGenericEnumerator var4 = var1.getParagraphs().iterator();

         try {
            while (var4.hasNext()) {
               IParagraph var5 = (IParagraph)var4.next();
               var3.addItem(this.n5(var5));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         var1.getTextFrameFormat().setAutofitType((byte)1);
      }

      return new u9(var3, var2);
   }

   private e2 n5(IParagraph var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var1.getPortions().iterator();

      try {
         while (var3.hasNext()) {
            IPortion var4 = (IPortion)var3.next();
            var2.addItem(new q0(var4, this.n5, this.l6));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return new u9(var2, "p");
   }
}
