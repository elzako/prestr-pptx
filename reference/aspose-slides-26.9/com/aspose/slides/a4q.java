package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

final class a4q extends w4 implements l8k {
   private final String k5;
   private final com.aspose.slides.internal.u0.n5<Integer> u3 = new com.aspose.slides.internal.u0.n5<>();
   public final SetEffect l6;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "style.visibility", "fill.type", "hidden", "visible", "solid", "style.fontWeight"
   );

   public static a4q n5(IShape var0, SetEffect var1) {
      return var1.getProperties().size() != 1
         ? null
         : new a4q(var0, new com.aspose.slides.internal.u0.n5<>(-1, -1), var1, var1.getProperties().get_Item(0).getValue());
   }

   public static a4q n5(IShape var0, com.aspose.slides.internal.u0.n5<Integer> var1, SetEffect var2) {
      return var2.getProperties().size() != 1 ? null : new a4q(var0, var1.n5(), var2, var2.getProperties().get_Item(0).getValue());
   }

   private a4q(IShape var1, com.aspose.slides.internal.u0.n5<Integer> var2, SetEffect var3, String var4) {
      super(var1);
      var2.n5(this.u3);
      this.l6 = var3;
      this.k5 = var4;
   }

   @Override
   public final void n5(float var1) {
      this.l6();
   }

   @Override
   public final void n5() {
      this.l6();
   }

   private void l6() {
      if (this.u3.n5 < 0) {
         this.n5(this.n5);
      } else {
         this.n5(this.u3.n5());
      }
   }

   private void n5(IShape var1) {
      switch (a6.n5(this.k5)) {
         case 0:
            switch (a6.n5(com.aspose.slides.internal.v6g.k5.n5(this.l6.getTo(), String.class))) {
               case 2:
                  var1.setHidden(true);
                  return;
               case 3:
                  var1.setHidden(false);
                  return;
               default:
                  return;
            }
         case 1:
            switch (a6.n5(com.aspose.slides.internal.v6g.k5.n5(this.l6.getTo(), String.class))) {
               case 4:
                  var1.getFillFormat().setFillType((byte)1);
            }
      }
   }

   private void n5(com.aspose.slides.internal.u0.n5<Integer> var1) {
      switch (a6.n5(this.k5)) {
         case 0:
            if (com.aspose.slides.internal.v6g.k5.l6(this.n5, AutoShape.class)) {
               f1z var8 = com.aspose.slides.internal.v6g.k5.n5(this.n5, AutoShape.class).l6().u3;
               switch (a6.n5(com.aspose.slides.internal.v6g.k5.n5(this.l6.getTo(), String.class))) {
                  case 2:
                     var8.n5((Integer)var1.n5, (Integer)var1.l6, true);
                     break;
                  case 3:
                     var8.n5((Integer)var1.n5, (Integer)var1.l6, false);
               }
            }
            break;
         case 5:
            if (com.aspose.slides.internal.v6g.k5.l6(this.n5, AutoShape.class)
               && "bold".equals(com.aspose.slides.internal.v6g.k5.n5(this.l6.getTo(), String.class))) {
               TextFrame var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5, AutoShape.class).l6();
               IGenericEnumerator var3 = var2.getParagraphs().iterator();

               try {
                  while (var3.hasNext()) {
                     IParagraph var4 = (IParagraph)var3.next();
                     var4.getParagraphFormat().getDefaultPortionFormat().setFontBold((byte)1);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                     var3.dispose();
                  }
               }
            }
      }
   }
}
