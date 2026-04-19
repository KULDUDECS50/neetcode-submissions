class DynamicArray:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.size = 0
        self.array = [None] * capacity

    def get(self, i: int) -> int:
        if 0 <= i < self.size:
            return self.array[i]
        else:
            raise IndexError("Index out of range")

    def set(self, i: int, n: int) -> None:
        if 0 <= i < self.size:
            self.array[i] = n
        else:
            raise IndexError("Index out of range")

    def pushback(self, n: int) -> None:
        if self.size == self.capacity:
            self.resize()
        self.array[self.size] = n
        self.size += 1

    def popback(self) -> int:
        if self.size == 0:
            raise IndexError("pop from empty array")
        self.size -= 1
        return self.array[self.size]

    def resize(self) -> None:
        new_capacity = self.capacity * 2
        new_array = [None] * new_capacity
        for i in range(self.size):
            new_array[i] = self.array[i]
        self.array = new_array
        self.capacity = new_capacity

    def getSize(self) -> int:
        return self.size

    def getCapacity(self) -> int:
        return self.capacity
