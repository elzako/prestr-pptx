package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.u8;

public abstract class n5 {
   public ArrayList n5 = new ArrayList();

   public final v0 n5(int var1) {
      return (v0)this.n5.get_Item(var1);
   }

   public final v0 n5() {
      return this.n5(this.n5.size() - 1);
   }

   protected final u8 n5(String var1, int[] var2) {
      u8 var3 = null;
      var2[0] = -1;

      for (int var4 = this.n5.size() - 1; var4 >= 0; var4--) {
         if ((var3 = this.n5(var4).n5(var1)) != null) {
            var2[0] = var4;
            return var3;
         }
      }

      return null;
   }

   protected final u8 l6(String var1, int[] var2) {
      u8 var3 = null;
      var2[0] = -1;

      for (int var4 = this.n5.size() - 1; var4 >= 0; var4--) {
         if ((var3 = this.n5(var4).l6(var1)) != null) {
            var2[0] = var4;
            return var3;
         }
      }

      return null;
   }

   public final void l6() {
      this.n5.addItem(new v0());
   }

   public final void k5() {
      this.n5.removeAt(this.n5.size() - 1);
   }

   public abstract void n5(u8 var1, SortedList var2, Hashtable var3);

   public abstract void n5(u8 var1, SortedList var2, SortedList var3, Hashtable var4);

   public abstract void n5(m8 var1, SortedList var2, SortedList var3, Hashtable var4);

   public final void n5(Hashtable var1) {
      Object[] var2 = new Object[var1.size()];
      var1.getValues().copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0);

      for (Object var6 : var2) {
         this.l6((u8)var6);
      }
   }

   public final void n5(SortedList var1) {
      IEnumerator var2 = var1.getKeyList().iterator();

      try {
         while (var2.hasNext()) {
            Object var3 = var2.next();
            this.n5((u8)var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }
   }

   public final void n5(u8 var1) {
      this.n5().n5(var1);
   }

   public final void l6(u8 var1) {
      this.n5().l6(var1);
   }
}
