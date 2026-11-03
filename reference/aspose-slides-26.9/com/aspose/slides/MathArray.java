package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

public final class MathArray extends MathElementBase implements IMathArray {
   private IMathElementCollection n5;
   private x3f u3;

   @Override
   public final IMathElementCollection getArguments() {
      return this.n5;
   }

   private void n5(IMathElementCollection var1) {
      this.n5 = var1;
   }

   @Override
   public final int getBaseJustification() {
      return this.u3.n5();
   }

   @Override
   public final void setBaseJustification(int value) {
      this.u3.n5(value);
   }

   @Override
   public final boolean getMaximumDistribution() {
      return this.u3.l6();
   }

   @Override
   public final void setMaximumDistribution(boolean value) {
      this.u3.n5(value);
   }

   @Override
   public final boolean getObjectDistribution() {
      return this.u3.k5();
   }

   @Override
   public final void setObjectDistribution(boolean value) {
      this.u3.l6(value);
   }

   @Override
   public final int getRowSpacingRule() {
      return this.u3.u3();
   }

   @Override
   public final void setRowSpacingRule(int value) {
      this.u3.l6(value);
   }

   @Override
   public final long getRowSpacing() {
      return this.u3.a6();
   }

   @Override
   public final void setRowSpacing(long value) {
      this.u3.n5(value);
   }

   final s7u n5() {
      return this.u3.u9();
   }

   public MathArray(IMathElement element) {
      if (element != null && ((MathElementBase)element).Y_()) {
         throw new InvalidOperationException("You should use the constructor with an argument for containers (IEnumerable<IMathElement>)");
      }

      this.n5(new o3q());
      this.getArguments().add(element);
      this.u3 = new x3f();
   }

   public MathArray(IGenericEnumerable<IMathElement> elements) {
      this(elements, null);
   }

   MathArray(IGenericEnumerable<IMathElement> elements, w1j properties) {
      if (elements == null) {
         throw new ArgumentNullException("elements");
      }

      this.n5(new o3q(elements));
      this.u3 = properties != null ? new x3f(properties) : new x3f();
   }

   @Override
   public final IMathElement[] getChildren() {
      if (this.getArguments().getCount() == 0) {
         return k5;
      }

      IMathElement[] var1 = new IMathElement[this.getArguments().getCount()];
      this.getArguments().copyTo(var1, 0);
      return var1;
   }

   final boolean l6() {
      return this.u3.h0();
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }
}
