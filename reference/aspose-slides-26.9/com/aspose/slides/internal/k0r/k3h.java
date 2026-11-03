package com.aspose.slides.internal.k0r;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.PptEditException;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public final class k3h implements IGenericEnumerable<m5l>, IGenericCloneable<k3h>, Cloneable {
   private SortedList<Short, m5l> n5 = new SortedList<>();

   public k3h() {
   }

   public k3h(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(var1);
   }

   public final int n5(m5l var1) {
      if (var1.l6() != null) {
         throw new PptEditException("Can't add already used tab");
      }

      var1.n5(this);
      if (this.n5.containsKey(var1.n5())) {
         if (this.n5.get_Item(var1.n5()).k5() == 0) {
            this.n5.set_Item(var1.n5(), var1);
         }
      } else {
         this.n5.set_Item(var1.n5(), var1);
      }

      return this.n5.indexOfKey(var1.n5());
   }

   final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = var1.r4();
      this.n5.clear();

      for (int var3 = 0; var3 < (var2 & 65535); var3++) {
         this.n5(new m5l(var1));
      }
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      long var2 = var1.n5().getPosition();
      var1.n5(this.n5.size() & 65535);
      IGenericEnumerator var4 = this.n5.getValues().iterator();

      try {
         while (var4.hasNext()) {
            m5l var5 = (m5l)var4.next();
            var5.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   final int n5() {
      return 2 + this.n5.size() * 4;
   }

   final boolean n5(k3h var1) {
      if (this.n5.size() != var1.n5.size()) {
         return false;
      }

      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         m5l var3 = this.n5.getValues().get_Item(var2);
         m5l var4 = var1.n5.getValues().get_Item(var2);
         if (var3.n5() != var4.n5() || var3.k5() != var4.k5()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final IGenericEnumerator<m5l> iterator() {
      return this.n5.getValues().iterator();
   }

   public final k3h l6() {
      return (k3h)this.k5();
   }

   protected Object k5() {
      try {
         k3h var1 = (k3h)super.clone();
         SortedList var2 = new SortedList();
         IGenericEnumerator var3 = this.n5.iterator();

         while (var3.hasNext()) {
            var2.addItem((KeyValuePair)var3.next());
         }

         var3.dispose();
         var1.n5 = var2;
         return var1;
      } catch (CloneNotSupportedException var4) {
         throw new IllegalStateException(var4);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k3h cloneT() {
      return this.l6();
   }

}
