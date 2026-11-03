package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import java.util.UUID;

public final class SensitivityLabel implements ISensitivityLabel {
   private String n5;
   private com.aspose.slides.ms.System.o0 l6 = new com.aspose.slides.ms.System.o0();
   private boolean k5;
   private boolean u3;
   private int a6;
   private IGenericList<Integer> u9;

   @Override
   public final String getId() {
      return this.n5;
   }

   @Override
   public final void setId(String value) {
      this.n5 = value;
   }

   @Override
   public final UUID getSiteId() {
      return com.aspose.slides.ms.System.o0.n5(this.n5());
   }

   com.aspose.slides.ms.System.o0 n5() {
      return this.l6.k5();
   }

   @Override
   public final void setSiteId(UUID value) {
      this.n5(com.aspose.slides.ms.System.o0.n5(value));
   }

   void n5(com.aspose.slides.ms.System.o0 var1) {
      this.l6 = var1.k5();
   }

   @Override
   public final boolean isEnabled() {
      return this.k5;
   }

   @Override
   public final void setEnabled(boolean value) {
      this.k5 = value;
   }

   @Override
   public final boolean isRemoved() {
      return this.u3;
   }

   @Override
   public final void setRemoved(boolean value) {
      this.u3 = value;
   }

   @Override
   public final int getAssignmentMethodType() {
      return this.a6;
   }

   @Override
   public final void setAssignmentMethodType(int value) {
      this.a6 = value;
   }

   @Override
   public final IGenericList<Integer> getContentMarkTypes() {
      return this.u9;
   }

   private void n5(IGenericList<Integer> var1) {
      this.u9 = var1;
   }

   SensitivityLabel(String id, com.aspose.slides.ms.System.o0 siteId, boolean isEnabled, int methodType) {
      this.setId(id);
      this.n5(siteId.k5());
      this.setEnabled(isEnabled);
      this.setAssignmentMethodType(methodType);
      this.n5(new List<>());
   }

   SensitivityLabel() {
      this.setId(com.aspose.slides.ms.System.d1.n5);
      this.n5(com.aspose.slides.ms.System.o0.n5.k5());
      this.setEnabled(true);
      this.setAssignmentMethodType(0);
      this.n5(new List<>());
   }
}
