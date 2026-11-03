package com.aspose.slides.internal.j3;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

class n5$n5 implements t9 {
   private List<String> n5;

   private n5$n5() {
   }

   public final void l6(String var1) {
      this.n5().addItem(var1);
   }

   @Override
   public final boolean n5(String var1) {
      return this.n5().containsItem(var1);
   }

   private List<String> n5() {
      if (this.n5 == null) {
         this.n5 = new List<>();
      }

      return this.n5;
   }

   @Override
   public final IGenericEnumerator<String> iterator() {
      return this.n5().iterator();
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/j3/n5$1;)V -> ()V
   n5$n5(com.aspose.slides.internal.j3.n5$1 recoveredArg0) {
      this();
   }
}
