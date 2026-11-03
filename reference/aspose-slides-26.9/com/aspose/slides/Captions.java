package com.aspose.slides;

import java.util.UUID;

public class Captions implements ICaptions {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private String l6;
   private String k5;
   private n4 u3;

   @Override
   public final UUID getCaptionId() {
      return com.aspose.slides.ms.System.o0.n5(this.n5());
   }

   com.aspose.slides.ms.System.o0 n5() {
      return this.n5.k5();
   }

   final void n5(com.aspose.slides.ms.System.o0 var1) {
      this.n5 = var1.k5();
   }

   @Override
   public final String getLabel() {
      return this.l6;
   }

   @Override
   public final void setLabel(String value) {
      this.l6 = value;
   }

   @Override
   public final byte[] getBinaryData() {
      return this.k5().l6().n5();
   }

   @Override
   public final String getDataAsString() {
      return com.aspose.slides.internal.l7h.j5.z3().l6(this.getBinaryData());
   }

   final String l6() {
      return this.k5;
   }

   final void n5(String var1) {
      this.k5 = var1;
   }

   Captions(n4 track, String label, String lang) {
      this.n5(com.aspose.slides.ms.System.o0.l6().k5());
      this.setLabel(label);
      this.n5(lang);
      this.n5(track);
   }

   final n4 k5() {
      return this.u3;
   }

   private void n5(n4 var1) {
      this.u3 = var1;
   }
}
