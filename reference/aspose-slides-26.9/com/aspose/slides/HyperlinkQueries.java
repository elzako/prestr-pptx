package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

public final class HyperlinkQueries implements IHyperlinkQueries, r0g {
   private r0g n5;

   @Override
   public final IGenericList<IHyperlinkContainer> getHyperlinkClicks() {
      return this.n5(this.n5, new HyperlinkQueries$1(this));
   }

   @Override
   public final IGenericList<IHyperlinkContainer> getHyperlinkMouseOvers() {
      return this.n5(this.n5, new HyperlinkQueries$2(this));
   }

   @Override
   public final IGenericList<IHyperlinkContainer> getAnyHyperlinks() {
      return this.n5(this.n5, new HyperlinkQueries$3(this));
   }

   @Override
   public final void removeAllHyperlinks() {
      IGenericList var1 = this.getAnyHyperlinks();
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            IHyperlinkContainer var3 = (IHyperlinkContainer)var2.next();
            var3.getHyperlinkManager().removeHyperlinkClick();
            var3.getHyperlinkManager().removeHyperlinkMouseOver();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   HyperlinkQueries(r0g parentImmediate) {
      this.n5 = parentImmediate;
   }

   private List<IHyperlinkContainer> n5(Object var1, HyperlinkQueries$n5 var2) {
      List var3 = new List();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, TextFrame.class)) {
         TextFrame var4 = (TextFrame)var1;
         IGenericEnumerator var5 = var4.getParagraphs().iterator();

         try {
            while (var5.hasNext()) {
               IParagraph var6 = (IParagraph)var5.next();
               if (var2.n5(var6.getParagraphFormat().getDefaultPortionFormat())) {
                  var3.addItem(var6.getParagraphFormat().getDefaultPortionFormat());
               }

               IGenericEnumerator var7 = var6.getPortions().iterator();

               try {
                  while (var7.hasNext()) {
                     IPortion var8 = (IPortion)var7.next();
                     if (var2.n5(((Portion)var8).l6())) {
                        var3.addItem(var8.getPortionFormat());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                     var7.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IShape.class)) {
         IShape var89 = (IShape)var1;
         if (var2.n5(var89)) {
            var3.addItem(var89);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var89, AutoShape.class)) {
            if (((AutoShape)var89).getTextFrame() != null) {
               var3.addRange(this.n5(((AutoShape)var89).getTextFrame(), var2));
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var89, GroupShape.class)) {
            IGenericEnumerator var92 = ((GroupShape)var89).getShapes().iterator();

            try {
               while (var92.hasNext()) {
                  IShape var98 = (IShape)var92.next();
                  var3.addRange(this.n5(var98, var2));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var92, IDisposable.class)) {
                  var92.dispose();
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var89, ITable.class)) {
            Table var93 = (Table)var89;

            for (int var99 = 0; var99 < var93.getColumns().size(); var99++) {
               for (int var104 = 0; var104 < var93.getRows().size(); var104++) {
                  if (var93.n5(var99, var104).getTextFrame() != null) {
                     var3.addRange(this.n5(var93.n5(var99, var104).getTextFrame(), var2));
                  }
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var89, ISmartArt.class)) {
            IGenericEnumerator var94 = ((ISmartArt)var89).getAllNodes().iterator();

            try {
               while (var94.hasNext()) {
                  SmartArtNode var100 = (SmartArtNode)var94.next();
                  IGenericEnumerator var105 = var100.getShapes().iterator();

                  try {
                     while (var105.hasNext()) {
                        IShape var106 = (IShape)var105.next();
                        var3.addRange(this.n5(var106, var2));
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var105, IDisposable.class)) {
                        var105.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var94, IDisposable.class)) {
                  var94.dispose();
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var89, ILegacyDiagram.class)) {
            IGenericEnumerator var95 = ((LegacyDiagram)var89).k5().getShapes().iterator();

            try {
               while (var95.hasNext()) {
                  IShape var101 = (IShape)var95.next();
                  var3.addRange(this.n5(var101, var2));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var95, IDisposable.class)) {
                  var95.dispose();
               }
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, BaseSlide.class)) {
         BaseSlide var90 = (BaseSlide)var1;
         IGenericEnumerator var96 = var90.getShapes().iterator();

         try {
            while (var96.hasNext()) {
               IShape var102 = (IShape)var96.next();
               var3.addRange(this.n5(var102, var2));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var96, IDisposable.class)) {
               var96.dispose();
            }
         }
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, Presentation.class)) {
            throw new ArgumentException();
         }

         Presentation var91 = (Presentation)var1;
         IGenericEnumerator var97 = var91.getSlides().iterator();

         try {
            while (var97.hasNext()) {
               ISlide var103 = (ISlide)var97.next();
               var3.addRange(this.n5(var103, var2));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var97, IDisposable.class)) {
               var97.dispose();
            }
         }
      }

      return var3;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }
}
