package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class b5i implements IMathNaryOperatorProperties, com.aspose.slides.ms.System.a5<b5i> {
   private char n5;
   private int l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private final s7u u9;

   @Override
   public final char getOperator() {
      return this.n5;
   }

   @Override
   public final void setOperator(char value) {
      this.n5 = value;
   }

   @Override
   public final int getLimitLocation() {
      return this.l6;
   }

   @Override
   public final void setLimitLocation(int value) {
      this.l6 = value;
   }

   @Override
   public final boolean getGrowToMatchOperandHeight() {
      return this.k5;
   }

   @Override
   public final void setGrowToMatchOperandHeight(boolean value) {
      this.k5 = value;
   }

   @Override
   public final boolean getHideSubscript() {
      return this.u3;
   }

   @Override
   public final void setHideSubscript(boolean value) {
      this.u3 = value;
   }

   @Override
   public final boolean getHideSuperscript() {
      return this.a6;
   }

   @Override
   public final void setHideSuperscript(boolean value) {
      this.a6 = value;
   }

   public final boolean n5() {
      return this.getOperator() == 0
         && this.getLimitLocation() == 0
         && !this.getGrowToMatchOperandHeight()
         && !this.getHideSubscript()
         && !this.getHideSuperscript()
         && this.l6().n5();
   }

   final s7u l6() {
      return this.u9;
   }

   public b5i() {
      this.u9 = new s7u();
   }

   public b5i(char var1) {
      this.setOperator(var1);
      this.u9 = new s7u();
   }

   public b5i(char var1, boolean var2, boolean var3) {
      this(var1);
      this.setHideSubscript(var2);
      this.setHideSuperscript(var3);
   }

   public b5i(IMathNaryOperatorProperties var1) {
      if (var1 == null) {
         throw new ArgumentNullException("properties");
      }

      this.setOperator(var1.getOperator());
      this.setLimitLocation(var1.getLimitLocation());
      this.setGrowToMatchOperandHeight(var1.getGrowToMatchOperandHeight());
      this.setHideSubscript(var1.getHideSubscript());
      this.setHideSuperscript(var1.getHideSuperscript());
      this.u9 = ((b5i)var1).l6();
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3, this.a6, this.u9);
   }

   @Override
   public final boolean equals(Object object) {
      if (object == null) {
         return false;
      }

      if (!(object instanceof b5i)) {
         return false;
      }

      b5i var2 = (b5i)object;
      return this.getOperator() == var2.getOperator()
         && this.getLimitLocation() == var2.getLimitLocation()
         && this.getGrowToMatchOperandHeight() == var2.getGrowToMatchOperandHeight()
         && this.getHideSubscript() == var2.getHideSubscript()
         && this.getHideSuperscript() == var2.getHideSuperscript()
         && this.l6().n5(var2.l6());
   }
}
