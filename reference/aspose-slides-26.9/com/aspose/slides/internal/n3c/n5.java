package com.aspose.slides.internal.n3c;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.v4;

@j3
public class n5 implements v4, Cloneable {
   private String n5;
   private short l6;
   private int k5;
   private int u3;
   private boolean a6;
   private int u9;
   private boolean h0;
   private int c8;

   public String n5() {
      return this.n5;
   }

   @Override
   public Object deepClone() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new RuntimeException(var2);
      }
   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      return super.clone();
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{
         "Printer [PrinterSettings ",
         this.n5,
         " Copies=",
         this.l6,
         " Collate=",
         this.a6,
         " Duplex=",
         this.h0,
         " FromPage=",
         this.k5,
         " LandscapeAngle=",
         this.c8,
         " MaximumCopies=",
         this.u9,
         " OutputPort=",
         " ToPage=",
         this.u3,
         "]"
      });
   }
}
