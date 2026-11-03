package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class p6d extends DomObject<BaseSlide> {
   private ParagraphFormat$n5 k5;
   final com.aspose.slides.internal.v6g.n5<ParagraphFormat$n5> n5 = new p6d$1(this);
   private ParagraphFormat$n5 u3;
   final com.aspose.slides.internal.v6g.n5<ParagraphFormat$n5> l6 = new p6d$2(this);
   private long a6 = 12L;

   p6d(BaseSlide var1) {
      super(var1);
   }

   final Shape n5(Placeholder var1) {
      return this.u9.l6(var1.getIndex());
   }

   final Shape l6(Placeholder var1) {
      return this.u9.n5(var1.getType());
   }

   final Shape n5(IPlaceholder var1, Placeholder var2) {
      byte var3 = var1.getType();
      switch (var3) {
         case 0:
         case 2:
            var3 = 0;
            break;
         case 1:
         case 3:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 15:
            var3 = 1;
         case 4:
         case 5:
         case 6:
         case 7:
         case 14:
      }

      return this.u9.n5(var3);
   }

   final void n5(BaseSlide var1) {
      List var2 = var1.c8();
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            Shape var4 = (Shape)var3.next();
            this.l6(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   final void n5(IShape var1) {
      if (var1.getPlaceholder() != null && ((BaseSlide)var1.getSlide()).l6 == this) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, AutoShape.class)) {
            TextFrame var2 = (TextFrame)((AutoShape)var1).getTextFrame();
            if (var2 != null) {
               ((TextStyle)var2.getTextFrameFormat().getTextStyle()).n5.n5(new p6d$3(this));
               this.l6.n5(new p6d$4(this, var2));
            }
         }
      }
   }

   final void l6(IShape var1) {
      Placeholder var2 = com.aspose.slides.internal.v6g.k5.n5(var1.getPlaceholder(), Placeholder.class);
      if (var2 != null && ((BaseSlide)var1.getSlide()).l6 == this) {
         if ((var2.getIndex() & 4294967295L) != 4294967295L && (var2.getIndex() & 4294967295L) > (this.a6 & 4294967295L)) {
            this.a6 = var2.getIndex();
         }

         AutoShape var3 = com.aspose.slides.internal.v6g.k5.n5(var1, AutoShape.class);
         if (var3 != null) {
            TextFrame var4 = (TextFrame)var3.getTextFrame();
            if (var4 != null) {
               ((TextStyle)var4.getTextFrameFormat().getTextStyle()).n5.l6(new p6d$5(this));
               this.l6.l6(new p6d$6(this, var4));
            }
         }
      }
   }

   final List<Long> n5() {
      List var1 = new List();
      List var2 = this.u9.c8();
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            Shape var4 = (Shape)var3.next();
            if (var4.getPlaceholder() != null) {
               var1.addItem(var4.getPlaceholder().getIndex());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }

   final long l6() {
      synchronized (this) {
         return ++this.a6;
      }
   }

   // $VF: synthetic method
   static ParagraphFormat$n5 n5(p6d var0, ParagraphFormat$n5 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static ParagraphFormat$n5 l6(p6d var0, ParagraphFormat$n5 var1) {
      return var0.u3 = var1;
   }
}
