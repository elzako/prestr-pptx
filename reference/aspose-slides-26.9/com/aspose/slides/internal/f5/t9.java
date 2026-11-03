package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class t9 implements com.aspose.slides.internal.j3.t9 {
   private List<String> n5;

   public final int n5() {
      return this.l6().size();
   }

   @Override
   public final boolean n5(String var1) {
      return this.l6().containsItem(var1);
   }

   private List<String> l6() {
      if (this.n5 == null) {
         this.n5 = new List<>();
      }

      return this.n5;
   }

   @Override
   public final IGenericEnumerator<String> iterator() {
      return this.l6().iterator();
   }

   public final String n5(int var1) {
      return this.l6().get_Item(var1);
   }
}
