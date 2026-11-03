package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.ms.System.Xml.u8;

public class v0 {
   private Hashtable n5 = new Hashtable();
   private Hashtable l6 = new Hashtable();

   public final void n5(u8 var1) {
      this.n5.addItem(i9.n5(var1), var1);
   }

   public final u8 n5(String var1) {
      return (u8)this.n5.get_Item(var1);
   }

   public final void l6(u8 var1) {
      this.l6.addItem(i9.n5(var1), var1);
   }

   public final u8 l6(String var1) {
      return (u8)this.l6.get_Item(var1);
   }

   public final Hashtable n5() {
      return this.l6;
   }
}
