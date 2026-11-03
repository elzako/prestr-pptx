package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public final class Sequence implements ISequence {
   private AnimationTimeLine l6;
   private m7g k5 = new m7g();
   Shape n5;

   Sequence(AnimationTimeLine parent) {
      this.l6 = parent;
   }

   final m7g n5() {
      return this.k5;
   }

   @Override
   public final int getCount() {
      return this.n5().u3().size();
   }

   @Override
   public final void remove(IEffect item) {
      if (item != null) {
         ((TextAnimation)item.getTextAnimation()).l6().n5().removeItem(item);
      }

      this.n5().u3().removeItem(item);
   }

   @Override
   public final void removeAt(int index) {
      if (this.n5().u3().get_Item(index) != null) {
         ((TextAnimation)((Effect)this.n5().u3().get_Item(index)).getTextAnimation()).l6().n5().removeItem(this.n5().u3().get_Item(index));
      }

      this.n5().u3().removeAt(index);
   }

   @Override
   public final void clear() {
      List var1 = new List();
      IGenericEnumerator var2 = this.l6.k5.iterator();

      try {
         while (var2.hasNext()) {
            TextAnimation var3 = (TextAnimation)var2.next();
            if (var3.n5() == this) {
               var1.addItem(var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var12 = var1.iterator();

      try {
         while (var12.hasNext()) {
            TextAnimation var4 = (TextAnimation)var12.next();
            this.l6.k5.n5().removeItem(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      this.n5().u3().clear();
   }

   @Override
   public final IEffect get_Item(int index) {
      return (Effect)this.n5().u3().get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IEffect> iterator() {
      return this.n5().u3().iterator();
   }

   public final IGenericEnumerator<IEffect> iteratorJava() {
      return this.n5().u3().iteratorJava();
   }

   @Override
   public final IShape getTriggerShape() {
      return this.n5;
   }

   @Override
   public final void setTriggerShape(IShape value) {
      this.n5 = (Shape)value;
   }

   @Override
   public final void removeByShape(IShape shape) {
      List var2 = new List();
      List$Enumerator var3 = this.n5().u3().iterator();

      try {
         while (var3.hasNext()) {
            Effect var4 = (Effect)var3.next();
            if (var4.k5().u3() == shape) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      List$Enumerator var13 = var2.iterator();

      try {
         while (var13.hasNext()) {
            Effect var5 = (Effect)var13.next();
            this.remove(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   @Override
   public final IEffect[] getEffectsByShape(IShape shape) {
      List var2 = new List();
      List$Enumerator var3 = this.n5().u3().iterator();

      try {
         while (var3.hasNext()) {
            Effect var4 = (Effect)var3.next();
            if (var4.k5().u3() == shape) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IEffect[] var8 = new IEffect[var2.size()];
      var2.copyTo(var8);
      return var8;
   }

   @Override
   public final IEffect[] getEffectsByParagraph(IParagraph paragraph) {
      List var2 = new List();
      List$Enumerator var3 = this.n5().u3().iterator();

      try {
         while (var3.hasNext()) {
            Effect var4 = (Effect)var3.next();
            if (var4.n5() == (Paragraph)paragraph || var4.l6() == (Paragraph)paragraph) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IEffect[] var8 = new IEffect[var2.size()];
      var2.copyTo(var8);
      return var8;
   }

   @Override
   public final int getCount(IShape shape) {
      int var2 = 0;
      List$Enumerator var3 = this.n5().u3().iterator();

      try {
         while (var3.hasNext()) {
            Effect var4 = (Effect)var3.next();
            if (var4.k5().u3() == shape) {
               var2++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   final Effect n5(IShape var1, int var2, int var3, int var4, int var5) {
      this.n5().n5(var1);
      this.n5().l6(var5);
      this.n5(var1, var2, var3, var4);
      this.n5().n5((IShape)null);
      Effect var6 = (Effect)this.n5().u3().get_Item(this.n5().u3().size() - 1);
      var6.getTiming().setTriggerType(var5);
      return var6;
   }

   private void n5(IShape var1, int var2, int var3, int var4) {
      String var5 = z9u.n5(var2, var3, var4, (Shape)var1);
      String var6 = com.aspose.slides.ms.System.d1.n5(var5,new Object[]{ "p", "a"});
      com.aspose.slides.internal.k4y.o2n var7 = v2i.n5(var6);
      SortedList var8 = new SortedList();
      Shape var9 = com.aspose.slides.internal.v6g.k5.n5(var1, Shape.class);
      if (var9 != null) {
         var8.set_Item(com.aspose.slides.ms.System.Xml.f4.l6(var9.v4()), var1);
      }

      w3j var10 = new w3j(var8);
      e0p.n5(this, null, var7, var10);
   }

   @Override
   public final IEffect addEffect(IShape shape, int effectType, int subtype, int triggerType) {
      int var5 = z9u.n5(effectType, subtype);
      Effect var6 = this.n5(shape, effectType, subtype, var5, triggerType);
      if (com.aspose.slides.internal.v6g.k5.l6(shape, AutoShape.class)) {
         TextAnimation var7 = new TextAnimation();
         var7.n5(this);
         this.l6.k5.n5(var7);
         var7.l6().n5(var6);
         var7.l6().n5(shape);
         var7.n5 = 0;
         var7.l6().n5().addItem(var6);
         var6.k5().n5(var7);
      }

      var6.k5().l6(this.l6.n5().n3());
      if (var6.k5().l6() > var6.k5().n5()) {
         var6.k5().n5(var6.k5().l6());
      }

      return var6;
   }

   @Override
   public final IEffect addEffect(IParagraph paragraph, int effectType, int subtype, int triggerType) {
      ((Paragraph)paragraph).t2();
      IShape var5 = com.aspose.slides.internal.v6g.k5.n5(((Paragraph)paragraph).x8().k5().k5(), IShape.class);
      if (var5 == null) {
         throw new InvalidOperationException("Paragraph should be assigned to the IShape");
      }

      int var6 = z9u.n5(effectType, subtype);
      Effect var7 = this.n5(var5, effectType, subtype, var6, triggerType);
      TextAnimation var8 = new TextAnimation();
      var8.n5(this);
      var8.k5 = true;
      this.l6.k5.n5(var8);
      var8.l6().n5(var7);
      var8.l6().n5(var5);
      var8.l6().n5().addItem(var7);
      var7.k5().n5(var8);
      var7.k5().l6(this.l6.n5().n3());
      if (var7.k5().l6() > var7.k5().n5()) {
         var7.k5().n5(var7.k5().l6());
      }

      int var9 = ((Paragraph)paragraph).h0();
      var7.n5(var9, var9, ((Paragraph)paragraph).x8());
      return var7;
   }

   @Override
   public final IEffect addEffect(IChart chart, int type, int index, int effectType, int subtype, int triggerType) {
      if (index < 0) {
         throw new ArgumentOutOfRangeException("index");
      }

      Effect var7 = (Effect)this.addEffect(chart, effectType, subtype, triggerType);
      var7.k5().t2(type);
      var7.k5().u9(index);
      return var7;
   }

   @Override
   public final IEffect addEffect(IChart chart, int type, int seriesIndex, int categoriesIndex, int effectType, int subtype, int triggerType) {
      if (seriesIndex < 0) {
         throw new ArgumentOutOfRangeException("seriesIndex");
      }

      if (categoriesIndex < 0) {
         throw new ArgumentOutOfRangeException("categoriesIndex");
      }

      Effect var8 = (Effect)this.addEffect(chart, effectType, subtype, triggerType);
      var8.k5().s7(type);
      var8.k5().h0(seriesIndex);
      var8.k5().c8(categoriesIndex);
      return var8;
   }

   final void n5(PictureFrame var1) {
      Effect var2 = new Effect(this);
      this.n5().u3().insertItem(0, var2);
      var2.k5().u3(44);
      var2.k5().k5(2);
      var2.k5().a6(0);
      var2.k5().n5(var1);
      var2.getBehaviors().add(new f6w());
      var2.getTiming().setTriggerType(2);
      var2.getTiming().setTriggerDelayTime(0.0F);
      var2.getTiming().setRepeatUntilEndSlide(true);
      var2.getTiming().setDuration(10.0F);
   }

   final AnimationTimeLine l6() {
      return this.l6;
   }
}
