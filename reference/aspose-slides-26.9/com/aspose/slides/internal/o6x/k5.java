package com.aspose.slides.internal.o6x;

import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.n3;
import java.util.LinkedList;
import java.util.Queue;

public class k5 {
   public String n5;
   public n3 l6;
   public e5 k5;
   public float u3;
   public float a6;
   public boolean u9;
   public float h0;
   public float[] c8;
   public String t2;
   public int s7;
   public int x8;
   Queue<k5$n5> n3 = new LinkedList<>();
   String y4;
   public int e2;

   public void n5(int var1, int var2, float var3) {
      if (var1 < var2) {
         this.n3.add(new k5$n5(var1, var2, var3));
      }
   }

   void n5() {
      this.n3.clear();
   }
}
