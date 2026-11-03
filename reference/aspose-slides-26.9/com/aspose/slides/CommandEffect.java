package com.aspose.slides;

public class CommandEffect extends Behavior implements ICommandEffect {
   byte a6;
   String u9;
   Shape h0;

   public CommandEffect() {
      super(new q4o());
   }

   final q4o l6() {
      return (q4o)super.n5();
   }

   @Override
   public final byte getType() {
      return this.a6;
   }

   @Override
   public final void setType(byte value) {
      this.a6 = value;
   }

   @Override
   public final String getCommandString() {
      return this.u9;
   }

   @Override
   public final void setCommandString(String value) {
      this.u9 = value;
   }

   @Override
   public final IShape getShapeTarget() {
      return this.h0;
   }

   @Override
   public final void setShapeTarget(IShape value) {
      this.h0 = (Shape)value;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   q4o n5() {
      return this.l6();
   }

}
