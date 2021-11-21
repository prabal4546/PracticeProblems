class Solution {
    func fizzBuzz(_ n: Int) -> [String] {
        var answer:[String] = []
        for num in 1...n{
            if num%3 == 0 && num%5 == 0
               { answer.append("FizzBuzz")}
            else if num%3 == 0
                {answer.append("Fizz")}
            else if num%5 == 0
                {answer.append("Buzz")}
            else
                {answer.append(String(num))}
        }
        return answer
    }
}