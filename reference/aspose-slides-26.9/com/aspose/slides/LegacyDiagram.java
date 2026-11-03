package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class LegacyDiagram extends GraphicalObject implements ILegacyDiagram {
   private GroupShape n5;

   @Override
   public final ISmartArt convertToSmartArt() {
      if (this.f0() == null) {
         throw new InvalidOperationException("ParentGroup can not be null.");
      }

      ShapeCollection var1 = (ShapeCollection)this.f0().getShapes();
      ShapeFrame var2 = this.p8();
      ISmartArt var3 = var1.addSmartArt(var2.getX(), var2.getY(), var2.getWidth(), var2.getHeight(), r6c.n5(this.n5().n5()));
      r6c.n5(var3, this.n5().n5(), this.k5().getShapes());
      return var3;
   }

   @Override
   public final IGroupShape convertToGroupShape() {
      if (this.f0() == null) {
         throw new InvalidOperationException("ParentGroup can not be null.");
      }

      IGroupShape var1 = this.f0().getShapes().addGroupShape();
      IGenericEnumerator var2 = this.n5.getShapes().iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            var1.getShapes().addClone(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   LegacyDiagram(r0g parentImmediate) {
      super(parentImmediate, new t4i());
      this.n5((g4a)null);
   }

   final t4i n5() {
      return (t4i)super.t4();
   }

   final GroupShape k5() {
      if (this.n5 == null) {
         this.n5 = new GroupShape(this);
      }

      o4f var1 = this.R_();
      o4f var2 = this.n5.R_();
      var2.n5(var1.n5().u9());
      this.n5.k5(this.z7().u9());
      var2.n5(var1.k5(), var1.u3(), var1.a6());
      return this.n5;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   t4i t4() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   t4i h0() {
      return this.n5();
   }

}
