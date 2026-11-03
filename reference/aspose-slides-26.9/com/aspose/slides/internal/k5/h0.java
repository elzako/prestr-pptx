package com.aspose.slides.internal.k5;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;

public class h0 extends u9 implements IGenericEnumerable<u9>, c4 {
   private List<u9> n5;

   public h0() {
      super((short)2);
      this.n5 = new List<>();
   }

   public h0(IGenericList<u9> var1) {
      super((short)2);
      this.n5 = new List<>(var1);
   }

   public h0(u9... var1) {
      super((short)2);
      this.n5 = new List<>(com.aspose.slides.ms.System.u3.n5(var1));
   }

   public final void l6(u9 var1) {
      this.n5.addItem(var1);
   }

   @Override
   public String u9() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      if (this.n5() > 0) {
         var1.n5(this.n5(0).u9());
      }

      for (int var2 = 1; var2 < this.n5(); var2++) {
         var1.n5(' ');
         var1.n5(this.n5.get_Item(var2).u9());
      }

      return var1.toString();
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)15);
   }

   @Override
   public final int n5() {
      return this.n5.size();
   }

   @Override
   public final u9 n5(int var1) {
      return this.n5.get_Item(var1);
   }

   @Override
   public final IGenericEnumerator<u9> iterator() {
      return this.n5.iterator();
   }
}
