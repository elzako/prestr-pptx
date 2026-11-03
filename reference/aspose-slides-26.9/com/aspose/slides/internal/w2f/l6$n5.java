package com.aspose.slides.internal.w2f;

import com.aspose.slides.Collections.Generic.List;

class l6$n5 implements l6$l6 {
   private List<String> n5 = new List<>();
   private List<String> l6 = new List<>();

   private l6$n5() {
   }

   @Override
   public int n5() {
      return this.n5.size();
   }

   @Override
   public String n5(int var1) {
      return this.n5.get_Item(var1);
   }

   @Override
   public String l6(int var1) {
      return this.l6.get_Item(var1);
   }

   void l6() {
      this.n5.clear();
      this.l6.clear();
   }

   void n5(String var1, String var2) {
      this.n5.addItem(var1);
      this.l6.addItem(var2);
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/w2f/k5;)V -> ()V
   l6$n5(com.aspose.slides.internal.w2f.k5 recoveredArg0) {
      this();
   }
}
