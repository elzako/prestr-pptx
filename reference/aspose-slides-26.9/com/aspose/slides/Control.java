package com.aspose.slides;

import java.util.UUID;

public class Control extends DomObject<ControlCollection> implements IControl {
   private final u3r n5;
   private final t6q l6;
   private String k5;
   private final PictureFillFormat u3;
   private IShapeFrame a6;
   private final ControlPropertiesCollection h0;
   private com.aspose.slides.ms.System.o0 c8 = com.aspose.slides.ms.System.o0.n5.k5();
   private byte[] t2;
   private int s7;
   private boolean x8;

   Control(ControlCollection parentImmediate) {
      super(parentImmediate);
      this.n5 = new u3r();
      this.l6 = new t6q();
      this.u3 = new PictureFillFormat(this);
      this.u3.setPictureFillMode(1);
      this.h0 = new ControlPropertiesCollection();
      this.n5(false);
   }

   final u3r n5() {
      return this.n5;
   }

   final t6q l6() {
      return this.l6;
   }

   final void n5(e3 var1, s5u var2) {
      if (!com.aspose.slides.ms.System.n1.k5(this.a6.getX())
         && !com.aspose.slides.ms.System.n1.k5(this.a6.getY())
         && !com.aspose.slides.ms.System.n1.k5(this.a6.getWidth())
         && !com.aspose.slides.ms.System.n1.k5(this.a6.getHeight())) {
         com.aspose.slides.internal.w0.c8 var3 = new com.aspose.slides.internal.w0.c8(
            this.a6.getFlipH() == 1 ? -1.0F : 1.0F,
            0.0F,
            0.0F,
            this.a6.getFlipV() == 1 ? -1.0F : 1.0F,
            this.a6.getFlipH() == 1 ? this.a6.getCenterX() * 2.0F : 0.0F,
            this.a6.getFlipV() == 1 ? this.a6.getCenterY() * 2.0F : 0.0F
         );
         if (!com.aspose.slides.ms.System.n1.k5(this.a6.getRotation())) {
            var3.n5(
               this.a6.getFlipH() == 1 ^ this.a6.getFlipV() == 1 ? -this.a6.getRotation() : this.a6.getRotation(),
               new com.aspose.slides.internal.o9b.w1(this.a6.getCenterX(), this.a6.getCenterY()),
               0
            );
         }

         var1.l6(var3);
         j5m var4 = new j5m(this.a6.cloneT(), new com.aspose.slides.internal.w0.c8(), null, this.getSlide(), var2);
         com.aspose.slides.internal.o9b.y1 var5 = ((ShapeFrame)this.a6).n5().y4();
         var1.n5(var5.y4(), null, new q3d(var4, (PictureFillFormat)this.getSubstitutePictureFormat()));
      }
   }

   @Override
   public final int getPersistence() {
      return this.s7;
   }

   final void n5(int var1) {
      this.s7 = var1;
   }

   @Override
   public final String getName() {
      return this.k5;
   }

   @Override
   public final void setName(String value) {
      this.k5 = value;
   }

   @Override
   public final UUID getClassId() {
      return com.aspose.slides.ms.System.o0.n5(this.k5());
   }

   com.aspose.slides.ms.System.o0 k5() {
      return this.c8;
   }

   public final void setClassId(UUID value) {
      this.n5(com.aspose.slides.ms.System.o0.n5(value));
   }

   void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.c8);
   }

   @Override
   public final IPictureFillFormat getSubstitutePictureFormat() {
      return this.u3;
   }

   @Override
   public final IShapeFrame getFrame() {
      return this.a6;
   }

   @Override
   public final void setFrame(IShapeFrame value) {
      this.a6 = value;
   }

   @Override
   public final IControlPropertiesCollection getProperties() {
      return this.getPersistence() == 0 ? this.h0 : null;
   }

   @Override
   public final byte[] getActiveXControlBinary() {
      return this.t2;
   }

   final void n5(byte[] var1) {
      this.t2 = var1;
   }

   final boolean u3() {
      return this.x8;
   }

   final void n5(boolean var1) {
      this.x8 = var1;
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.u9.n5;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.u9.n5.getPresentation();
   }
}
