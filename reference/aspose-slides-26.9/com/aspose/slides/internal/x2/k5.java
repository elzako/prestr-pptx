package com.aspose.slides.internal.x2;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.l7h.t1;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.y4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class k5 extends n5 {
   private IGenericDictionary<Integer, String> n5 = new Dictionary<>();
   private IGenericDictionary<Integer, String> l6 = new Dictionary<>();
   private j5 k5 = new t1(true, false);
   private int u3;

   public final Dictionary<Integer, String> n5() {
      return this.k5() ? (Dictionary)this.n5 : (Dictionary)this.l6;
   }

   public final int l6() {
      return this.u3;
   }

   private void l6(int var1) {
      this.u3 = var1;
   }

   public k5() {
      this.l6(-1);
   }

   public boolean k5() {
      return this.n5.size() != 0;
   }

   public String n5(byte[] var1, int var2, int var3) {
      String var4 = null;
      int var5 = 0;
      if (var3 == 1) {
         var5 = var1[var2] & 255 & 0xFF;
         String[] var6 = new String[]{var4};
         this.n5.tryGetValue(var5, var6);
         var4 = var6[0];
      } else if (var3 == 2) {
         int var9 = var1[var2] & 255 & 0xFF;
         var9 <<= 8;
         var9 += var1[var2 + 1] & 255 & 0xFF;
         String[] var7 = new String[]{var4};
         this.l6.tryGetValue(var9, var7);
         var4 = var7[0];
      }

      return var4;
   }

   public IGenericDictionary<Integer, Integer> u3() {
      Dictionary var1 = new Dictionary();
      IGenericEnumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1.set_Item(this.u3((String)var3.getValue()), var3.getKey());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var12 = this.l6.iterator();

      try {
         while (var12.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var12.next();
            var1.set_Item(this.u3((String)var4.getValue()), var4.getKey());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      return var1;
   }

   public IGenericDictionary<Integer, Integer> a6() {
      Dictionary var1 = new Dictionary();
      IGenericEnumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1.set_Item(var3.getKey(), this.u3((String)var3.getValue()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var12 = this.l6.iterator();

      try {
         while (var12.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var12.next();
            var1.set_Item(var4.getKey(), this.u3((String)var4.getValue()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      return var1;
   }

   private int u3(String var1) {
      t1 var2 = new t1(true, false);
      byte[] var3 = var2.u3(var1);
      int var4 = 0;

      for (int var5 = 0; var5 < var3.length - 1; var5++) {
         var4 += var3[var5] & 255 & 0xFF;
         var4 <<= 8;
      }

      return var4 + (var3[var3.length - 1] & 0xFF & 0xFF);
   }

   @Override
   public void n5(y4 var1, s7 var2) {
      byte[] var3 = var1.n5();
      if (com.aspose.slides.internal.v6g.k5.l6(var2, y4.class)) {
         String var4 = this.n5(((y4)var2).n5());
         if (var3.length == 1) {
            this.n5.set_Item(var3[0] & 255 & 0xFF, var4);
            if (" ".equals(var4)) {
               this.l6(var3[0] & 255 & 0xFF);
            }
         } else {
            if (var3.length != 2) {
               String var8 = d1.n5("The mapping code should be 1 or 2 bytes. Actual is '{0}'", new Object[]{var3.length});
               throw new IOException(var8);
            }

            int var5 = var3[0] & 255 & 0xFF;
            var5 <<= 8;
            var5 |= var3[1] & 255 & 0xFF;
            this.l6.set_Item(var5, var4);
            if (" ".equals(var4)) {
               this.l6(var5);
            }
         }
      }
   }

   private String n5(byte[] var1) {
      String var2 = null;
      if (var1.length == 1) {
         var2 = d1.n5((char)(var1[0] & 0xFF & 0xFF), 1);
      } else {
         var2 = this.k5.l6(var1);
      }

      return var2;
   }
}
