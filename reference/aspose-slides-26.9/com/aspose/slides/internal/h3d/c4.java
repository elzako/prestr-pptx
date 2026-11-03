package com.aspose.slides.internal.h3d;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public final class c4 {
   private Hashtable n5 = new Hashtable();
   private ArrayList l6 = new ArrayList();
   private String k5;
   private String u3;
   private c8 a6;

   public c4(y8 var1, c8 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("type", "Null argument");
      }

      if (var2 == null) {
         throw new ArgumentNullException("converter", "Null argument");
      }

      this.a6 = var2;
      this.k5 = var1.t4().l6();
      this.u3 = var1.q0();
   }

   public String n5() {
      return this.k5;
   }

   public String l6() {
      return this.u3;
   }

   public int k5() {
      return this.n5.size();
   }

   public void n5(String var1, Object var2, y8 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("name is null");
      }

      if (var3 == null) {
         throw new ArgumentNullException("type is null");
      }

      if (this.n5.containsKey(var1)) {
         throw new SerializationException("Value has been serialized already.");
      }

      w1 var4 = new w1(var1, var3, var2);
      this.n5.addItem(var1, var4.u3());
      this.l6.addItem(var4.u3());
   }

   public Object n5(String var1, y8 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("name is null.");
      }

      if (var2 == null) {
         throw new ArgumentNullException("type");
      }

      if (!this.n5.containsKey(var1)) {
         throw new SerializationException(d1.n5(new String[]{"No element named ", var1, " could be found."}));
      }

      w1 var3 = ((w1)this.n5.get_Item(var1)).u3();
      return var3.k5() != null && !var2.n5(var3.k5()) ? this.a6.n5(var3.k5(), var2) : var3.k5();
   }

   public y2 u3() {
      return new y2(this.l6);
   }

   public void n5(String var1, int var2) {
      this.n5(var1, var2, com.aspose.slides.internal.v6g.k5.n5(int.class));
   }

   public void n5(String var1, boolean var2) {
      this.n5(var1, var2, com.aspose.slides.internal.v6g.k5.n5(boolean.class));
   }

   public void n5(String var1, float var2) {
      this.n5(var1, var2, com.aspose.slides.internal.v6g.k5.n5(float.class));
   }

   public void n5(String var1, long var2) {
      this.n5(var1, var2, com.aspose.slides.internal.v6g.k5.n5(long.class));
   }

   public void n5(String var1, Object var2) {
      if (var2 == null) {
         this.n5(var1, var2, com.aspose.slides.internal.v6g.k5.n5(Object.class));
      } else {
         this.n5(var1, var2, j8.n5(var2));
      }
   }

   public int n5(String var1) {
      Object var2 = this.n5(var1, com.aspose.slides.internal.v6g.k5.n5(int.class));
      return this.a6.n5(var2);
   }

   public float l6(String var1) {
      Object var2 = this.n5(var1, com.aspose.slides.internal.v6g.k5.n5(float.class));
      return this.a6.l6(var2);
   }
}
