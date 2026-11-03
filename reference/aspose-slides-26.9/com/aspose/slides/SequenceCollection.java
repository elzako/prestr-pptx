package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class SequenceCollection implements ISequenceCollection {
   private final List<ISequence> l6 = new List<>();
   AnimationTimeLine n5;

   SequenceCollection(AnimationTimeLine tl) {
      this.n5 = tl;
   }

   @Override
   public final int getCount() {
      return this.l6.size();
   }

   @Override
   public final ISequence add(IShape shapeTrigger) {
      Sequence var2 = new Sequence(this.n5);
      var2.setTriggerShape(shapeTrigger);
      var2.n5().n5((byte)4);
      this.l6.addItem(var2);
      return var2;
   }

   @Override
   public final void remove(ISequence item) {
      this.l6.removeItem(item);
   }

   @Override
   public final void removeAt(int index) {
      this.l6.removeAt(index);
   }

   @Override
   public final void clear() {
      this.l6.clear();
   }

   @Override
   public final ISequence get_Item(int index) {
      return this.l6.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<ISequence> iterator() {
      return this.l6.iterator();
   }

   public final IGenericEnumerator<ISequence> iteratorJava() {
      return this.l6.iteratorJava();
   }
}
