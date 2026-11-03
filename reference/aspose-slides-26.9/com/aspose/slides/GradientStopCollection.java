package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Color;

public final class GradientStopCollection extends PVIObject implements IGradientStopCollection {
   private c6l l6;
   final com.aspose.slides.internal.v6g.n5<c6l> n5 = new GradientStopCollection$1(this);
   private List<IGradientStop> k5;

   GradientStopCollection(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.k5 = new List<>();
   }

   @Override
   Object M_() {
      return new y6s(this.k5);
   }

   final y6s l6() {
      return (y6s)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().k5();
   }

   @Override
   public final int size() {
      this.m3();
      return this.k5.size();
   }

   @Override
   public final IGradientStop get_Item(int index) {
      this.m3();
      return this.k5.get_Item(index);
   }

   @Override
   public final IGradientStop add(float position, Color color) {
      return this.n5(position, com.aspose.slides.internal.o9b.c8.n5(color));
   }

   IGradientStop n5(float var1, com.aspose.slides.internal.o9b.c8 var2) {
      this.k7();
      GradientStop var3 = new GradientStop(this, var1, var2.o8());
      this.l6().n5(var3);
      this.h0();
      return var3;
   }

   @Override
   public final IGradientStop addPresetColor(float position, int presetColor) {
      this.k7();
      GradientStop var3 = new GradientStop(this, position, presetColor);
      this.l6().n5(var3);
      this.h0();
      return var3;
   }

   @Override
   public final IGradientStop addSchemeColor(float position, int schemeColor) {
      this.k7();
      GradientStop var3 = new GradientStop(this, position, schemeColor, true);
      this.l6().n5(var3);
      this.h0();
      return var3;
   }

   @Override
   public final void insert(int index, float position, Color color) {
      this.n5(index, position, com.aspose.slides.internal.o9b.c8.n5(color));
   }

   void n5(int var1, float var2, com.aspose.slides.internal.o9b.c8 var3) {
      this.k7();
      this.l6().n5(var1, new GradientStop(this, var2, var3.o8()));
      this.h0();
   }

   @Override
   public final void insertPresetColor(int index, float position, int presetColor) {
      this.k7();
      this.l6().n5(index, new GradientStop(this, position, presetColor));
      this.h0();
   }

   @Override
   public final void insertSchemeColor(int index, float position, int schemeColor) {
      this.k7();
      this.l6().n5(index, new GradientStop(this, position, schemeColor, true));
      this.h0();
   }

   @Override
   public final void removeAt(int index) {
      if (!this.z3()) {
         throw new ArgumentOutOfRangeException("index");
      }

      this.l6().n5(index);
      this.h0();
   }

   @Override
   public final void clear() {
      if (this.z3()) {
         this.l6().n5();
         this.h0();
      }
   }

   @Override
   public final IGenericEnumerator<IGradientStop> iterator() {
      this.m3();
      return this.k5.iterator();
   }

   @Override
   public final IGenericEnumerator<IGradientStop> iteratorJava() {
      this.m3();
      return this.k5.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.m3();
      this.k5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   final IGradientStop u3() {
      this.k7();
      GradientStop var1 = new GradientStop(this);
      this.l6().n5(var1);
      this.h0();
      return var1;
   }

   final IGradientStop a6() {
      this.k7();
      GradientStop var1 = new GradientStop(this);
      this.l6().n5(var1);
      return var1;
   }

   final void u9() {
      if (this.z3()) {
         this.l6().l6();
      }
   }

   final GradientStop n5(float var1) {
      if (!this.z3()) {
         return null;
      }

      this.m3();
      List$Enumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            GradientStop var3 = (GradientStop)var2.next();
            if (var1 == var3.getPosition()) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   final void h0() {
      c6l var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static c6l n5(GradientStopCollection var0, c6l var1) {
      return var0.l6 = var1;
   }
}
