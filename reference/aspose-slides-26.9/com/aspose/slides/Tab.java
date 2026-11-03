package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

public final class Tab extends PVIObject implements ITab {
   public Tab(double position, int align) {
      super(null);
      this.m3();
      this.n5(new b5b(position, align));
   }

   @Override
   Object M_() {
      throw new NotImplementedException("Can not create Tab object with lazy initialization, use instant constructor instead.");
   }

   final b5b l6() {
      return (b5b)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().n5();
   }

   @Override
   public final double getPosition() {
      return this.z3() ? this.l6().getPosition() : 0.0;
   }

   @Override
   public final void setPosition(double value) {
      this.n5(0.0, value);
      if (this.z3()) {
         if (this.l6().getPosition() == value) {
            return;
         }

         TabCollection var3 = (TabCollection)this.getParent_Immediate();
         if (var3 != null) {
            var3.n5(value);
         }

         this.l6().setPosition(value);
         if (var3 != null) {
            var3.add(this);
         }
      }
   }

   @Override
   public final int getAlignment() {
      return this.z3() ? this.l6().getAlignment() : 0;
   }

   @Override
   public final void setAlignment(int value) {
      this.n5(0, value);
      if (this.z3()) {
         this.l6().setAlignment(value);
      }
   }

   @Override
   public final int compareTo(Object obj) {
      return com.aspose.slides.ms.System.d2.n5(this.getPosition(), ((Tab)obj).getPosition());
   }

   final void n5(TabCollection var1) {
      this.k7();
      this.l6().n5(var1);
   }
}
