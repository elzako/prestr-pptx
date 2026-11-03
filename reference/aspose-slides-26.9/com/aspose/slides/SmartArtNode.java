package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public final class SmartArtNode implements ISmartArtNode {
   private final SmartArt n5;
   private SmartArtNode l6;
   private final SmartArtNodeCollection k5;
   private w4c u3;
   private w4c a6;
   private w4c u9;
   private final List<k6a> h0;

   @Override
   public final ISmartArtNodeCollection getChildNodes() {
      return this.k5;
   }

   @Override
   public final ISmartArtShapeCollection getShapes() {
      SmartArtShapeCollection var1 = new SmartArtShapeCollection();
      List$Enumerator var2 = this.h0.iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            if (var3.c8().l6() != null) {
               boolean var4 = var3.c8().t4() && (var3.a6().e2() == 5 || var3.a6().e2() == 6);
               if (!var4) {
                  var1.n5(var3.c8().l6());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   @Override
   public final ITextFrame getTextFrame() {
      this.h0();
      return this.u3.n5();
   }

   @Override
   public final boolean isAssistant() {
      return this.u3.a6() == 2;
   }

   @Override
   public final void setAssistant(boolean value) {
      int var2 = value ? 2 : 1;
      if (this.u3.a6() != var2) {
         this.u3.n5(var2);
         this.n5.x8();
      }
   }

   @Override
   public final int getLevel() {
      return this.l6 == null ? -1 : this.l6.getLevel() + 1;
   }

   @Override
   public final IFillFormat getBulletFillFormat() {
      SmartArtShape var1 = null;
      List$Enumerator var2 = this.h0.iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            if (var3.c8().q0()) {
               var1 = var3.c8().l6();
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1 != null ? var1.getFillFormat() : null;
   }

   @Override
   public final int getPosition() {
      if (this.l6 == null) {
         return 0;
      }

      SmartArtNodeCollection var1 = (SmartArtNodeCollection)this.l6.getChildNodes();
      return var1.n5(this);
   }

   @Override
   public final void setPosition(int value) {
      if (value < 0) {
         throw new ArgumentOutOfRangeException("Position can not be less than 0");
      }

      if (this.l6 != null) {
         SmartArtNodeCollection var2 = (SmartArtNodeCollection)this.l6.getChildNodes();
         if (this.l6.getChildNodes().size() <= value) {
            throw new ArgumentOutOfRangeException("Position can not be equal to or greater than siblings count");
         }

         var2.n5(this, value);
      }
   }

   @Override
   public final boolean isHidden() {
      return this.h0.size() == 0;
   }

   @Override
   public final int getOrganizationChartLayout() {
      List$Enumerator var1 = this.h0.iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var2.s7(), l5w.class)) {
               com.aspose.slides.internal.k4y.s3p var3 = var2.y4().k5().k7();
               if (var3 != null && var3.c8() != null) {
                  return n5(var3.c8().n5());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return 0;
   }

   @Override
   public final void setOrganizationChartLayout(int value) {
      k6a var2 = null;
      List$Enumerator var3 = this.h0.iterator();

      try {
         while (var3.hasNext()) {
            k6a var4 = (k6a)var3.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var4.s7(), l5w.class)) {
               com.aspose.slides.internal.k4y.s3p var5 = var4.y4().k5().k7();
               if (var5 == null) {
                  var5 = var4.y4().k5().n5();
               }

               if (var5.c8() == null) {
                  var5.l6();
               }

               var2 = var4;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (var2 != null) {
         var2.y4().k5().k7().c8().n5(l6(value));
         this.n5.x8();
      }
   }

   @Override
   public final boolean remove() {
      if (this.l6 != null) {
         this.l6.getChildNodes().removeNode(this);
         return true;
      } else {
         return false;
      }
   }

   SmartArtNode(SmartArtNode parent, SmartArt target) {
      if (target == null) {
         throw new ArgumentNullException("target");
      }

      this.n5 = target;
      this.l6 = parent;
      this.k5 = new SmartArtNodeCollection(this);
      this.h0 = new List<>();
   }

   final void n5(List<k6a> var1) {
      this.h0.clear();
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            if (var3.u9().size() > 0) {
               List$Enumerator var4 = var3.u9().iterator();

               try {
                  while (var4.hasNext()) {
                     l6s var5 = (l6s)var4.next();
                     if (this.n5(var5.t9())) {
                        this.h0.addItem(var3);
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                     var4.dispose();
                  }
               }
            } else if (this.n5(var3.a6().t9())) {
               this.h0.addItem(var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var21 = this.k5.iterator();

      try {
         while (var21.hasNext()) {
            SmartArtNode var22 = (SmartArtNode)var21.next();
            var22.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }
   }

   final w4c n5() {
      return this.u3;
   }

   final void n5(w4c var1) {
      this.u3 = var1;
   }

   final w4c l6() {
      return this.a6;
   }

   final void l6(w4c var1) {
      this.a6 = var1;
   }

   final w4c k5() {
      return this.u9;
   }

   final void k5(w4c var1) {
      this.u9 = var1;
   }

   final SmartArtNode u3() {
      return this.l6;
   }

   final void n5(SmartArtNode var1) {
      this.l6 = var1;
   }

   final SmartArt a6() {
      return this.n5;
   }

   final boolean u9() {
      if (this.h0.size() > 0) {
         k6a var1 = this.h0.get_Item(0);
         com.aspose.slides.internal.k4y.s3p var2 = var1.y4().k5().k7();
         if (var2 != null && var2.h0() != null) {
            return var2.h0().n5() == 2;
         }
      }

      return false;
   }

   final void n5(boolean var1) {
      if (this.h0.size() > 0) {
         k6a var2 = this.h0.get_Item(0);
         com.aspose.slides.internal.k4y.s3p var3 = var2.y4().k5().k7();
         if (var3 == null) {
            var3 = var2.y4().k5().n5();
         }

         if (var3.h0() == null) {
            var3.n5();
         }

         var3.h0().n5(var1 ? 2 : 1);
      }
   }

   private boolean n5(String var1) {
      return com.aspose.slides.ms.System.d1.a6(this.u3.u3(), var1)
         || this.a6 != null && com.aspose.slides.ms.System.d1.a6(this.a6.u3(), var1)
         || this.u9 != null && com.aspose.slides.ms.System.d1.a6(this.u9.u3(), var1);
   }

   private void h0() {
      TextFrame var1 = this.u3.n5();
      IGenericEnumerator var2 = this.getShapes().iterator();

      try {
         while (var2.hasNext()) {
            SmartArtShape var3 = (SmartArtShape)var2.next();
            TextFrame var4 = var3.k5();
            if (var4 == null) {
               this.n5.n5().u3();
               var4 = var3.k5();
            }

            if (var4 != null && !com.aspose.slides.ms.System.d1.n5(var4.getText())) {
               var1.a6(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static int n5(int var0) {
      switch (var0) {
         case 0:
         case 4:
            return 1;
         case 1:
            return 3;
         case 2:
            return 4;
         case 3:
            return 2;
         case 5:
         default:
            return 0;
      }
   }

   private static int l6(int var0) {
      switch (var0) {
         case 0:
         default:
            return 5;
         case 1:
            return 4;
         case 2:
            return 3;
         case 3:
            return 1;
         case 4:
            return 2;
      }
   }
}
